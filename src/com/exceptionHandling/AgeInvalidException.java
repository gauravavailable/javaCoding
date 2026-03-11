package com.exceptionHandling;

public class AgeInvalidException extends RuntimeException{
    public AgeInvalidException(){
        super("Age Limit is (26 to 36");
    }
}
