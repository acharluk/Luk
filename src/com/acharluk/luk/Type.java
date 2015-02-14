package com.acharluk.luk;

/**
 * Created by ACharLuk on 06/01/2015.
 */
public interface Type {

    public static Type match(String str) {
        try {
            return BuiltInType.valueOf(str.toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }

}
