package com.string;

public class AddNo {
    public static void main(String[] args) {
        String s = "Gau12rav34";
        char[] a = s.toCharArray();
        int sum = 0;
        for (char c : a) {
            if (c >= '0' && c <= '9') {
                sum += (c - '0');
            }
        }
        System.out.print(sum);
    }
}
