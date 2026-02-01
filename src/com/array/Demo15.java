package com.array;

public class Demo15 {
    public static void main(String[] args) {
        int [] a = {1,2,9,3,9,4,9,6,9,9,8,7,4};
        int b = 9;
        for(int i = a.length-1;i>=0;i--){
            if(a[i] == b){
                System.out.println(i);
                break;
            }
        }
    }
}
