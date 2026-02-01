package com.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s1="javadev";
        String s2="";
        char[] a=s1.toCharArray();
        for (int i = 0; i < a.length; i++){
            if (s2.indexOf(a[i])== -1){
                s2 += a[i];
            }
        }
        System.out.println(s2);
    }
}
