package com.parser.domain;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    private List<String> modifiers = new ArrayList<>();
    private String name;

    public void addModifier(String modifier){
        modifiers.add(modifier);
    }

    public List<String> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<String> modifiers) {
        this.modifiers = modifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete(){
        return getName() != null;
    }

}
