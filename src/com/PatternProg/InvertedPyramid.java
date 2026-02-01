package com.PatternProg;

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        int star = 2*n-1;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            space++;
            star -= 2;
            System.out.println();
        }
    }
}
