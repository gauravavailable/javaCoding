package com.array;

public class Demo5 {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            if(a[i] % 2 != 1){
                System.out.print(a[i] + " ");
            }
        }
    }
}
