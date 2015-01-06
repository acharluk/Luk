package com.acharluk.luk;

/**
 * Created by ACharLuk on 06/01/2015.
 */
public class Value {

    private Type type;
    private Object value;

    public Value(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
