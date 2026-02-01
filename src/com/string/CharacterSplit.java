package com.string;
public class CharacterSplit {
    public static void main(String[] args) {
        String s="java is very easy lang";
        String[] a=s.split(" ");
        String s1=" ";
        for (int i=a.length-1;i>=0;i--){
            s1 += a[i];
            if (i>0){
                s1 +=" ";
            }
        }
        System.out.println(s1);
    }
}
