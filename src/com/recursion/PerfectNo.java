package com.recursion;
public class PerfectNo {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        System.out.print(isPerfect(n,sum,n/2));
    }
    static boolean isPerfect(int n,int sum,int i) {
        if (i < 1) return sum == n;
        if (n % i == 0) sum += i;
        return isPerfect(n, sum, i - 1);
    }
}