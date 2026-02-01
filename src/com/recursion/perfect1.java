package com.recursion;

public class perfect1 {
    public static void main(String[] args) {
        int n=6;
        if(isperfect(n,n/2,0))
            System.out.println("perfect");
        else
            System.out.println("Not perfect");
    }

    public static boolean isperfect(int n,int i,int sum)
    {

        if(i==0)return n==sum;
        if (n%i==0) sum+=i;
        return isperfect(n,i-1,sum);
    }
}
