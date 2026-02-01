package com.search;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 11, 24, 26};
        System.out.println(search(a, 24));
        System.out.println(search(a, 18));
    }

    static int search(int[] a, int key) {
        return search(a, key, 0, a.length - 1);
    }

    static int search(int[] a, int key, int start, int end) {
        if (start>end) return -1;
        int mid=(start+end)/2;
        if (key==a[mid]) return mid;
        else if(key<a[mid]) return search(a,key,start,mid-1);
        else return search(a,key,mid+1,end);
    }
}
