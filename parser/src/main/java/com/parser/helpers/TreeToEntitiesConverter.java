package com.parser.helpers;

import com.parser.domain.ClassEntity;
import com.parser.domain.EnumEntity;
import com.parser.domain.InterfaceEntity;
import com.parser.parser.classes.ClassBodyListener;
import com.parser.parser.classes.ClassListener;
import com.parser.parser.enums.EnumBodyListener;
import com.parser.parser.enums.EnumListener;
import com.parser.parser.interfaces.InterfaceBodyListener;
import com.parser.parser.interfaces.InterfaceListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class TreeToEntitiesConverter {

    private final ParseTreeWalker parseTreeWalker;

    public TreeToEntitiesConverter(){
        parseTreeWalker = new ParseTreeWalker();
    }

    public Object convert(ParserRuleContext root){
        Object returningEntity;
        returningEntity = createEnum(root);
        if (returningEntity == null){
            returningEntity = createInterface(root);
        }
        if (returningEntity == null){
            returningEntity = createClass(root);
        }
        return returningEntity;
    }

    private EnumEntity createEnum(ParserRuleContext enumRoot){
        EnumEntity entity;
        EnumListener listener = new EnumListener();
        try {
            parseTreeWalker.walk(listener, enumRoot);
            entity = listener.getEntity();
            if (entity != null)
                entity = getEnumBody(entity, listener.getBodyDeclarations());
        } catch (final Exception e){
            return null;
        }
        return entity;
    }

    private InterfaceEntity createInterface(ParserRuleContext interfaceRoot){
        InterfaceEntity entity;
        InterfaceListener listener = new InterfaceListener();
        try {
            parseTreeWalker.walk(listener, interfaceRoot);
            entity = listener.getEntity();
            if (entity != null){
                entity = getInterfaceBody(entity, listener.getInterfaceBody());
            }
        } catch (Exception e){
            return null;
        }
        return entity;
    }

    private ClassEntity createClass(ParserRuleContext classRoot){
        ClassEntity entity;
        ClassListener listener = new ClassListener();
        try {
            parseTreeWalker.walk(listener, classRoot);
            entity = listener.getEntity();
            if (entity != null){
                entity = getClassBody(entity, listener.getBodyDeclarations());
            }
        } catch (Exception e){
            return null;
        }

        return entity;
    }

    private EnumEntity getEnumBody(EnumEntity enumEntity, List<ParserRuleContext> enumBodyDeclarations){
        for (ParserRuleContext eb: enumBodyDeclarations){
            EnumBodyListener enumBodyListener = new EnumBodyListener(enumEntity);
            parseTreeWalker.walk(enumBodyListener, eb);
            enumEntity = enumBodyListener.getEnumEntity();
        }
        return enumEntity;
    }

    private InterfaceEntity getInterfaceBody(InterfaceEntity interfaceEntity, List<ParserRuleContext> interfaceBodyDeclarations){
        for (ParserRuleContext ib: interfaceBodyDeclarations){
            InterfaceBodyListener interfaceBodyListener = new InterfaceBodyListener(interfaceEntity);
            parseTreeWalker.walk(interfaceBodyListener, ib);
            interfaceEntity = interfaceBodyListener.getInterfaceEntity();
        }
        return interfaceEntity;
    }

    private ClassEntity getClassBody(ClassEntity classEntity, List<ParserRuleContext> classBodyDeclarations){
        boolean constructorNext = false;
        for (ParserRuleContext ib: classBodyDeclarations){
            ClassBodyListener classBodyListener = new ClassBodyListener(classEntity, constructorNext);
            parseTreeWalker.walk(classBodyListener, ib);
            classEntity = classBodyListener.getClassEntity();
            constructorNext = classBodyListener.isConstructorNext();
        }
        return classEntity;
    }
}
