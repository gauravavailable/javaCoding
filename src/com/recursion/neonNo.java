package com.recursion;
public class neonNo {

    public static void main(String[] args) {
        int n=9;
        if(isneonno(n,n*n,0))
            System.out.println("Neon");
        else
            System.out.println("Not Neon");
    }

    public static boolean isneonno(int n,int sq,int sum)
    {
        if(sq==0)return n==sum;
        return isneonno(n,sq/10,sum+(sq%10));
    }
}
