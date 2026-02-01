package com.array;

public class Demo21 {
    public static void main(String[] args) {
        int[] a = {0,4,2,3};
        int min = Integer.MAX_VALUE;
        int element = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
