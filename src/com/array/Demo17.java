package com.array;

public class Demo17 {
        public static void main(String[] args) {
            int[] a = {1, 2, 1, 3, 2, 2, 4};
            int max = 0;
            int element = a[0];
            for (int i = 0; i < a.length; i++) {
                int count = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    element = a[i];
                }
            }
            System.out.println(element +"->"+ max);
        }
    }

