package com.parser.domain;

public class FieldEntity extends Entity {
    private String value;
    private String type;

    public FieldEntity(){}

    public FieldEntity(FieldEntity fieldEntity){
        this.setValue(fieldEntity.getValue());
        this.setName(fieldEntity.getName());
        this.setModifiers(fieldEntity.getModifiers());
        this.setType(fieldEntity.getType());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
