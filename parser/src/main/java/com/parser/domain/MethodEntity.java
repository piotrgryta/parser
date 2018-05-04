package com.parser.domain;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MethodEntity extends Entity{

    private List<FieldEntity> arguments = new LinkedList<>();
    private String returnType;

    public void addArgument(FieldEntity field){
        arguments.add(field);
    }

    public List<FieldEntity> getArguments() {
        return arguments;
    }

    public void setArguments(List<FieldEntity> arguments) {
        this.arguments = arguments;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
}
