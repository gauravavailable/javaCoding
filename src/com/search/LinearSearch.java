package com.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={4,5,3,2,7,8,5,3,18,26,55};
        System.out.println(search(a,9));
        System.out.println(search(a,18));
    }
    static int search(int[] a,int key){
        for (int i=0;i<a.length;i++){
            if (a[i]==key) return i;
        }
        return -1;
    }




}
