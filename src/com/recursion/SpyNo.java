package com.recursion;

public class SpyNo {
    public static void main(String[] args) {
        int n=1124;
        int sum=0;
        int prod=1;
        System.out.print(isSpyNo(n,sum,prod));
    }
    static boolean isSpyNo(int n,int sum,int prod) {
        while (n == 0) return sum == prod;
            sum += n % 10;
            prod *= n % 10;
            return isSpyNo(n / 10, sum, prod);

    }
}
