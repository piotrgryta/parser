package com.parser.helpers;

import com.parser.domain.*;

import java.util.*;

public class EntityToYumlParser {

    private final List<EnumEntity> enums;
    private final List<InterfaceEntity> interfaces;
    private final List<ClassEntity> classes;

    private List<String> aggregateRelations = new LinkedList<>();
    private List<String> associateRelations = new LinkedList<>();
    private List<String> extendsRelation = new LinkedList<>();
    private List<String> implementsRelation = new LinkedList<>();

    private final MyFilter filter = new MyFilter();

    private enum Sc {
        COMMA("͵"), S_RIGHT("«"), S_LEFT("»");

        private String symbol;
        private Sc(String symbol){
            this.symbol = symbol;
        }
    }

    private enum EntitySymbol{
        CLASS, INTERFACE, ENUM;
    }

    public EntityToYumlParser(List<EnumEntity> enums, List<InterfaceEntity> interfaces, List<ClassEntity> classes){
        enums.stream().forEach(x -> x.setName(Sc.S_RIGHT.symbol + "enumeration" + Sc.S_LEFT.symbol + " " + x.getName()));
        interfaces.stream().forEach(x -> x.setName(Sc.S_RIGHT.symbol + "interface" + Sc.S_LEFT.symbol + " " + x.getName()));
        this.enums = enums;
        this.interfaces = interfaces;
        this.classes = classes;
    }

    public String parse(){
        Set<String> enumYumls = new LinkedHashSet<>();
        Set<String> interfaceYumls = new LinkedHashSet<>();
        Set<String> classYumls = new LinkedHashSet<>();
        getRelations(interfaces, classes, enums);
        enums.forEach( e -> enumYumls.add(getEnumYuml(e)));
        interfaces.forEach(i -> interfaceYumls.add(getInterfaceYuml(i)));
        classes.forEach(c -> classYumls.add(getClassYuml(c)));

        StringBuffer buffer = new StringBuffer();
        enumYumls.forEach(x -> buffer.append(x + ","));
        interfaceYumls.forEach(x -> buffer.append(x + ","));
        classYumls.forEach(x -> buffer.append(x + ","));
        implementsRelation.forEach(x -> buffer.append(x + ","));
        extendsRelation.forEach(x -> buffer.append(x + ","));
        aggregateRelations.forEach(x -> buffer.append(x + ","));
        associateRelations.forEach(x -> buffer.append(x + ","));

        System.out.println(buffer.toString());
        return null;
    }

    private String getEnumYuml(EnumEntity e){
        String yuml = "[";
        yuml += e.getName() + "|";
        String enumConstants = getEnumConstantsYuml(e.getEnumConstants());
        if (!enumConstants.isEmpty()){
            yuml += enumConstants;
            yuml += "|";
        }
        String enumFields = getFieldsYuml(e.getFields());
        if (!enumFields.isEmpty()){
            yuml += enumFields;
            yuml += "|";
        }
        yuml += getMethodsYuml(e.getMethods());
        yuml += "]";
        return yuml;
    }

    private String getInterfaceYuml(InterfaceEntity i){
        String yuml = "[";
        yuml += i.getName();
        String interfaceMethods = getMethodsYuml(i.getMethods());
        if (!interfaceMethods.isEmpty()){
            yuml += "|";
            yuml += interfaceMethods;
        }
        yuml += "]";
        return yuml;
    }

    private String getClassYuml(ClassEntity c){
        String yuml = "[" + c.getName();
        String classFields = getFieldsYuml(c.getFields());
        if (!classFields.isEmpty()) {
            yuml += "|";
            yuml += classFields;
        }
        String classMethods = getMethodsYuml(c.getMethods());
        if (!classMethods.isEmpty()){
            yuml += "|";
            yuml += classMethods;
        }
        yuml += "]";
        return yuml;
    }

    private String getEnumConstantsYuml(Map<String, List<String>> input){
        String output = "";
        for (Map.Entry<String, List<String>> entry : input.entrySet()) {
            output += entry.getKey();
            List<String> attrs = entry.getValue();
            for (int i = 0; i < attrs.size(); i++) {
                if (i == 0) output += ":";
                output += attrs.get(i);
                if (i != attrs.size() - 1) output += Sc.COMMA.symbol + " ";
                else output += ";";
            }
        }
        return output;
    }

    private String getFieldsYuml(List<FieldEntity> fields){
        String output = "";
        for (FieldEntity f : fields) {
            output += getModifiersAndName(f.getModifiers(), f.getType(), f.getName());
            if (f.getValue() != null && !f.getValue().isEmpty())
                output += " = " + f.getValue();
            output += getStaticDescription(f.getModifiers());
            output += ";";
        }
        return output;
    }

    private String getMethodsYuml(List<MethodEntity> methods){
        String output = "";
        for(MethodEntity m: methods){
            output += getModifiersAndName(m.getModifiers(), m.getReturnType(), m.getName());
            output += "(";

            List<FieldEntity> args = m.getArguments();
            for (int i = 0; i < args.size(); i++) {
                output += getModifiersAndName(args.get(i).getModifiers(), args.get(i).getType(), args.get(i).getName());
                if (i != args.size() - 1) output += Sc.COMMA.symbol + " ";
                else output += ")";
            }
            output += getStaticDescription(m.getModifiers());
            output += ";";
        }
        return output;
    }

    private String getModifiersAndName(List<String> modifiers, String type, String name){
        String output = "";
        boolean fin = false;
        for (String mod : modifiers) {
            if (!mod.equals("final"))
                output += filter.translateModifiers(mod);
            else
                fin = true;
        }
        if (fin)
            output += name.toUpperCase();
        else
            output += name;
        output += ":" + type;

        return output;
    }

    private String getStaticDescription(List<String> modifiers){
       boolean stat =  modifiers.stream().anyMatch(x -> x.equals("static"));
       if (stat){
           return " " + Sc.S_RIGHT.symbol + "static" + Sc.S_LEFT.symbol;
       } else {
           return "";
       }
    }

    private void getRelations(List<InterfaceEntity> interfaces, List<ClassEntity> classes, List<EnumEntity> enums){
        getImplementsRelations(interfaces, classes, enums);
        getAggregationRelations(interfaces, classes, enums);
        getAssociationRelations(interfaces, classes, enums);
    }

    private void getImplementsRelations(List<InterfaceEntity> interfaces, List<ClassEntity> classes, List<EnumEntity> enums){
        Iterator<InterfaceEntity> it = interfaces.listIterator();
        while(it.hasNext()){
            InterfaceEntity i = it.next();
            i.getImplementing().forEach(impl -> {
                Entity e = getExistingInEntities(impl, interfaces, classes, enums);
                Entity parent = new InterfaceEntity();
                if (e == null){
                    parent.setName(impl);
                    ((ListIterator<InterfaceEntity>) it).add((InterfaceEntity) packEntityNameWithType(parent));
                } else {
                    parent = e;
                }
                implementsRelation.add(getExtendsYuml(i, parent, EntitySymbol.INTERFACE));
            });
        }

        Iterator<ClassEntity> it2 = classes.listIterator();
        while(it2.hasNext()){
            ClassEntity c = it2.next();
            c.getImplementing().forEach(impl -> {
                Entity e = getExistingInEntities(impl, interfaces, classes, enums);
                Entity parent = new InterfaceEntity();
                if (e == null){
                    parent.setName(impl);
                    interfaces.add((InterfaceEntity) packEntityNameWithType(parent));
                } else {
                    parent = e;
                }
                implementsRelation.add(getImplementsYuml(c, parent));
            });
            if (c.getExtending() != null){
                Entity e = getExistingInEntities(c.getExtending(), interfaces, classes, enums);
                Entity parent = new ClassEntity();
                if (e == null){
                    parent.setName(c.getExtending());
                    ((ListIterator<ClassEntity>) it2).add((ClassEntity) packEntityNameWithType(parent));
                } else {
                    parent = e;
                }
                extendsRelation.add(getExtendsYuml(c, parent, EntitySymbol.CLASS));
            }
        }
    }

    private void getAggregationRelations(List<InterfaceEntity> interfaces, List<ClassEntity> classes, List<EnumEntity> enums){
        Iterator<ClassEntity> it = classes.listIterator();
        while(it.hasNext()){
            ClassEntity c = it.next();
            for (FieldEntity f: c.getFields()){
                Entity e = getExistingInEntities(f.getType(), interfaces, classes, enums);
                boolean isPrimitive = filter.isBuildInDataType(f.getType());
                Entity parent;
                if (!isPrimitive){
                    if (e == null){
                        parent = new ClassEntity();
                        parent.setName(f.getName());
                        ((ListIterator<ClassEntity>) it).add((ClassEntity) packEntityNameWithType(parent));
                    } else {
                        parent = e;
                    }
                    if (!filter.isAggregateRealation(c.getName(), parent.getName(), aggregateRelations))
                        associateRelations.add(getAggregatesYuml(c, parent));
                }
            }
        }
    }

    private void getAssociationRelations(List<InterfaceEntity> interfaces, List<ClassEntity> classes, List<EnumEntity> enums){
        Iterator<ClassEntity> it = classes.listIterator();
        while(it.hasNext()){
            ClassEntity c = it.next();
            for (MethodEntity m: c.getMethods()){
                for (FieldEntity f: m.getArguments()){
                    Entity e = getExistingInEntities(f.getType(), interfaces, classes, enums);
                    boolean isPrimitive = filter.isBuildInDataType(f.getType());
                    Entity parent;
                    if (!isPrimitive){
                        if (e == null){
                            parent = new ClassEntity();
                            parent.setName(f.getType());
                            ((ListIterator<ClassEntity>) it).add((ClassEntity) packEntityNameWithType(parent));
                        } else {
                            parent = e;
                        }
                        aggregateRelations.add(getAssociatesYuml(c, parent));
                    }
                }
            }
        }
    }


    private Entity getExistingInEntities(String entity, List<InterfaceEntity> interfaces, List<ClassEntity> classes, List<EnumEntity> enums){
        for(InterfaceEntity i: interfaces){
            if (i.getName().contains(entity)){
                return i;
            }
        }
        for(ClassEntity c: classes){
            if (c.getName().contains(entity)){
                return c;
            }
        }
        for(EnumEntity e: enums){
            if (e.getName().contains(entity)){
                return e;
            }
        }
        return null;
    }

    private Entity packEntityNameWithType(Entity entity){
        if (entity instanceof InterfaceEntity){
            entity.setName(Sc.S_RIGHT.symbol + "interface" + Sc.S_LEFT.symbol + " " + entity.getName());
        } else if (entity instanceof EnumEntity){
            entity.setName(Sc.S_RIGHT.symbol + "enumeration" + Sc.S_LEFT.symbol + " " + entity.getName());
        }
        return entity;
    }

    private String getImplementsYuml(Entity child, Entity parent){
        if (parent != null)
            return "[" + parent.getName() + "]<" +  Sc.S_RIGHT.symbol + "implements" + Sc.S_LEFT.symbol+ "-[" + child.getName() + "]";
        else
            return "";
    }

    private String getExtendsYuml(Entity child, Entity parent, EntitySymbol entity){
        if (parent != null)
            if (entity.equals(EntitySymbol.INTERFACE))
                return "[" + parent.getName() + "]<" +  Sc.S_RIGHT.symbol + "extends" + Sc.S_LEFT.symbol+ "-[" + child.getName() + "]";
            else
                return "[" + parent.getName() + "]<" +  Sc.S_RIGHT.symbol + "extends" + Sc.S_LEFT.symbol+ "-[" + child.getName() + "]";
        else
            return "";
    }

    private String getAggregatesYuml(Entity child, Entity parent){
        if (parent != null){
            return "[" + parent.getName() + "]<-<>[" + child.getName() + "]";
        }
        return "";
    }

    private String getAssociatesYuml(Entity child, Entity parent){
        if (parent != null){
            return "[" + parent.getName() + "]-[" + child.getName() + "]";
        }
        return "";
    }
}
