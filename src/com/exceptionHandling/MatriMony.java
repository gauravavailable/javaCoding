package com.exceptionHandling;

public class MatriMony {
    public static void main(String[] args) {
        int age = 20;
        if(age > 26 && age < 36){
            System.out.println("Eligible");
        }
        else {
            throw new AgeInvalidException();
        }
    }
}
