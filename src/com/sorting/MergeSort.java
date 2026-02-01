package com.sorting;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {10, 12, 5, 86, 5, 0, 2, 34, 23};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        if (a.length <= 1) return;
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        int i = 0;
        while (i < left.length) {
            left[i] = a[i];
            i++;
        }
        int j = 0;
        while (j < right.length)
            right[j++] = a[i++];

        sort(left);
        sort(right);
        merge(left, right, a);
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];
        while (j < right.length)
            result[k++] = right[j++];
    }
}
