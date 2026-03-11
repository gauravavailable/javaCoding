package com.exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            System.out.println("try- started");
            System.out.println(10 / 0);
            System.out.println("try-ended");
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        }
        System.out.println("main end");
    }
}
