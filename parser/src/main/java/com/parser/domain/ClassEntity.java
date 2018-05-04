package com.parser.domain;

import java.util.*;

public class ClassEntity extends Entity{
    private List<FieldEntity> fields = new LinkedList<>();
    private List<MethodEntity> methods = new LinkedList<>();
    private String extending;
    private List<String> implementing = new LinkedList<>();

    public void addField(FieldEntity field){
        fields.add(field);
    }

    public void addMethod(MethodEntity method){
        methods.add(method);
    }

    public void addImplementing(String connection){
        implementing.add(connection);
    }

    public List<FieldEntity> getFields() {
        return fields;
    }

    public void setFields(List<FieldEntity> fields) {
        this.fields = fields;
    }

    public List<MethodEntity> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodEntity> methods) {
        this.methods = methods;
    }

    public List<String> getImplementing() {
        return implementing;
    }

    public void setImplementing(List<String> connections) {
        this.implementing = connections;
    }

    public String getExtending() {
        return extending;
    }

    public void setExtending(String extending) {
        this.extending = extending;
    }
}
