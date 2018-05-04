package com.parser.domain;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EnumEntity extends Entity {

    private List<FieldEntity> fields = new LinkedList<>();
    private Map<String, List<String>> enumConstants = new LinkedHashMap<>();
    private List<MethodEntity> methods = new LinkedList<>();

    public void addMethod(MethodEntity method){
        methods.add(method);
    }

    public void addField(FieldEntity field){
        fields.add(field);
    }

    public void addAttributeToConstant(String con, String attr){
        enumConstants.get(con).add(attr);
    }

    public void addEnumConstants(String enumConstant, List<String> literals){
        enumConstants.put(enumConstant, literals);
    }

    public List<FieldEntity> getFields() {
        return fields;
    }

    public void setFields(List<FieldEntity> fields) {
        this.fields = fields;
    }

    public  Map<String, List<String>> getEnumConstants() {
        return enumConstants;
    }

    public List<MethodEntity> getMethods() {
        return methods;
    }

}
