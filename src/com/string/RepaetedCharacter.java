package com.string;

public class RepaetedCharacter {
    public static void main(String[] args) {
        String s1="javadev";
        String s2="";
        while (s1.length()>0){
            char c=s1.charAt(0);
            s2=s1.replace(c+"","");
            if(s1.length()-s2.length()>1){
                System.out.print(c + " ");
            }
            s1=s2;
        }
    }
}
