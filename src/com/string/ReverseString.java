package com.string;

public class ReverseString {
    public static void main(String[] args) {
        String s1="Java is easy";
        char[] ch=s1.toCharArray();
        int i=0, j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String s2=new String(ch);
        System.out.println(ch);

    }
}
