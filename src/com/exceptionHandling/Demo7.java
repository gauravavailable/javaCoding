package com.exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println("DB open");
        try{
            System.out.println(10/0);
            return;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("handled");
        } finally {
            System.out.println("DB closed");
        }
        System.out.println("main ends");
    }
}
