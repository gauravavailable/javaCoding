package com.array;

public class Demo11 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int n : a) {
            boolean flag = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && n >= 2) System.out.println("Prime no in Array is " + n);
        }
    }
}




