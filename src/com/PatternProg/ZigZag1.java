package com.PatternProg;

public class ZigZag1 {
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        int y = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(x+"\t");
                    x++;
                }
            } else {
                y=x-1+n;
                x=y+1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(y+"\t");
                    y--;
                }
            }
            System.out.println();
        }
    }
}

