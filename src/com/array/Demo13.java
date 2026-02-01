package com.array;

public class Demo13 {
    public static void main(String[] args) {
        int [] a = {1,0,3,0,4,0,5,6,0};
        int count = 0;
        for(int m : a){
            if(m == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
