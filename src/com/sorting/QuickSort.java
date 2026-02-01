package com.sorting;
import java.util.Arrays;
public class QuickSort {
    public static void sort(int[] a, int start, int end) {
        if (start >= end) return;
        int i = start, j = end;
        int pivot = a[(start + end) / 2];
        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int temp = a[i];
                a[i++] = a[j];
                a[j--] = temp;
            }
        }
        sort(a, start, j);
        sort(a, i, end);
    }
    public static void main(String[] args) {
        int[] a = {10, 12, 5, 86, 78, 5, 0, 2};
        System.out.println(Arrays.toString(a));
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
