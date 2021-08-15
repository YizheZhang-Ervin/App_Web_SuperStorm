package com.ervin.util;

import com.ervin.exceptions.paramsException;

public class assertUtil {
    public static void isTrue(Boolean flag,String msg){
        if(flag){
            throw new paramsException(msg);
        }
    }
}
