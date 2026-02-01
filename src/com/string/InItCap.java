package com.string;

public class InItCap {
    public static void main(String[] args) {
        String s="java is easy";
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (i==0||ch[i-1]==' '){
                if(ch[i]>'a' && ch[i]<='z')
                    ch[i] -=32;
            }
        }
        System.out.println(ch);
    }
}
