package com.array;
import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = 0;
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if (b % 2 == 0) {
                a[m] = b;
                m++;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Even element is :" + a[i]);
        }
    }
}
