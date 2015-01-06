package com.acharluk.luk;

/**
 * Created by ACharLuk on 06/01/2015.
 */
public class Parameter {

    private String name;
    private Type type;

    public Parameter(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

}
