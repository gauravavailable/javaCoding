package com.recursion;

public class Factorial {
        public static void main(String[] args) {
            m1(5,1);
        }

        public static void m1(int n,int prod) {
            if(n<1){
                System.out.println(prod);
                return;
            }
            prod*=n;
            m1(n-1,prod);
        }
}
