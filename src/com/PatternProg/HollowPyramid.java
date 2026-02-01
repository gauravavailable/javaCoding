package com.PatternProg;
public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= star; j++) {
                    if (j==1||j==star){
                    System.out.print("*");
                    } else{
                System.out.print(" ");
            }
            }
            if (i<n)
            {
                space--;
                star += 2;
            }
            else
            {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}