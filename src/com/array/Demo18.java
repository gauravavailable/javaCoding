package com.array;

public class Demo18 {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2};
        int min = Integer.MAX_VALUE;
        int element = a[0];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count < min) {
                min = count;
                element = a[i];
            }
        }
        System.out.println(element +"-"+ min);
    }
}
