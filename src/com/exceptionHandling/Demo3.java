package com.exceptionHandling;

public class Demo3 {

    public static void m1(){
        System.out.println("m1() -Demo3");
    }

    public static void main(String[] args) {
        Demo3 d = null;
        System.out.println("main starts");
        d.m1(); // NullPointerException
        System.out.println("main ends");
    }
}
