package com.exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println("main start");
        int[] a ={4,3,2,1};
        try{
            System.out.println("Outer try");
            System.out.println(a[a.length]);
            try{
                System.out.println("Inner try");
//                System.out.println(a[3] / 0);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inner Catch");
            }
        }catch ( ArithmeticException e){
            System.out.println("outer Catch");
        }
        System.out.println("main stop");
    }
}
