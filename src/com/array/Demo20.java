package com.array;

public class Demo20 {
    public static void main(String[] args) {
        int[] a = {0,4,2,3};
        int max = Integer.MIN_VALUE;
        int element = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

