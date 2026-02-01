package com.PatternProg;
public class SnakePattern {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int num = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(num++ + " ");
                }
            }
            else {
                int start = num + cols - 1;
                for (int j = 0; j < cols; j++) {
                    System.out.print(start-- + " ");
                }
                num += cols;
            }
            System.out.println();
        }
    }
}