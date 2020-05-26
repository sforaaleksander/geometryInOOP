package com.codecool.java;

public class ArgumentException extends RuntimeException {
    public static boolean validateArgs(float... args){
        for (float argument : args){
            if (argument <= 0){
                return false;
            }
        }return true;
    }
}
