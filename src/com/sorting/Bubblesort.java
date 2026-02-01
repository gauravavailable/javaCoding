package com.sorting;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] a={10,12,5,86,78,5,0,2,34,23};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }

            }
    }
}
