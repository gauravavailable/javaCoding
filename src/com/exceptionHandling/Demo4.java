package com.exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println("main start");
        try {
            System.out.println(a[a.length]/0);

        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Handled");
        }
        System.out.println("main ends");
    }
}
