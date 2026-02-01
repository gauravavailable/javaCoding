package com.recursion;

public class SumNo {
    public static void main(String[] args) {
        m1(1,0);
    }

    public static void m1(int i,int sum) {
        if(i>5){
            System.out.println(sum);
            return;
        }
        sum+=i;
        m1(i+1,sum);

    }
}
