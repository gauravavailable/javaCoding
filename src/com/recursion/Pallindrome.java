package com.recursion;

public class Pallindrome {
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPallindrome(n,n,0));
    }

    public  static boolean isPallindrome(int n,int m,int rev){
        if(n==0) return m==rev;
        return (isPallindrome(n/10,m,(rev*10)+(n%10)));
    }
}
