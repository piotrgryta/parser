package com.parser.domain;

import java.util.LinkedList;
import java.util.List;

public class InterfaceEntity extends Entity{
    private List<MethodEntity> methods = new LinkedList<>();
    private List<String> implementing = new LinkedList<>();

    public void addMethod(MethodEntity method){
        methods.add(method);
    }

    public void addImplementing(String impl){
        implementing.add(impl);
    }

    public List<MethodEntity> getMethods() {
        return methods;
    }

    public List<String> getImplementing() {
        return implementing;
    }

}
