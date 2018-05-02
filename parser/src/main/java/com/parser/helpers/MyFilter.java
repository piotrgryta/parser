package com.parser.helpers;

import java.util.Arrays;
import java.util.List;

public class MyFilter {

    private static String[] dataTypes = {"byte", "short", "int", "long", "float", "double", "char", "String", "boolean",
                                         "Byte", "Short", "Integer", "Long", "Float", "Double", "Character", "Boolean"};


    public boolean isLiteral(String input){
        String output = input.replaceAll("[^a-zA-Z0-9.\"]", "");
        return !output.isEmpty();
    }

    public String translateModifiers(String modifier){
        if (modifier.contains("private"))
            return "+";
        if (modifier.contains("public"))
            return "-";
        if (modifier.contains("protected"))
            return "#";
        return modifier;
    }

    public boolean isBuildInDataType(String type){
        return Arrays.stream(dataTypes).anyMatch(x -> x.equals(type));
    }

    public boolean isAggregateRealation(String child, String parent, List<String> aggregations){
        return aggregations.stream()
                .map(aggr -> aggr.split("-"))
                .anyMatch(parts -> parts[0].contains(child) && parts[1].contains(parent));
    }
}
