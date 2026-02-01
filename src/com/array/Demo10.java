package com.array;

public class Demo10 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,11,244,35,5,7};
        int count = 0;
        for(int i=a.length-1;i>=0;i--){
            count++;
            if(count == 2){
                System.out.println(a[i]);
            }
        }
    }
}
