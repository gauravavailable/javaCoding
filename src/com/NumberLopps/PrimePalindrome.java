package com.NumberLopps;
public class PrimePalindrome {
    public static boolean isPrime(int n,int i ){
        if (n<2)    return false;
        if (i*i>n)  return true;
        if (n%i==0) return false;
        return isPrime(n,i+1);
    }

    public static boolean isPallindrome(int n,int temp,int rev){
        if(n==0)     return temp == rev;
        return isPallindrome(n/10,temp,rev*10+(n%10));
    }

    public static void main(String[] args) {
        if(isPallindrome(11,11,0) && isPrime(11,2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}