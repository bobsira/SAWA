package com.mtusawa.Utils;

/**
 * Created by bobsira on 1/18/18.
 */

public class StringManipulation {
    public static String expandUsername(String username){
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username){
        return username.replace(" " , ".");
    }
}
