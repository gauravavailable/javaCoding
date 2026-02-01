package com.array;

public class Demo7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            if(i % 2 != 0){
                sum1 += a[i];
            }
            else{
                sum2 += a[i];
            }
        }
        System.out.println(sum1 + "(sum of odd index)" + " ; " + sum2 + "(sum of even index)");
    }
}

