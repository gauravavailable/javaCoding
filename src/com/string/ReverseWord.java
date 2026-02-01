package com.string;

public class ReverseWord {
    public static void main(String[] args) {
        String s="Java is very easy";
        String res=" ";
        int i=0;
        int j=0;
        while(j<s.length()){
            while(j<s.length() && s.charAt(j) != ' ')
                j++;
            int k=j-1;
            while (k>=i){
                res+=s.charAt(k);
                k--;
            }
            if (j<s.length())
                res+=" ";
            j++;
            i=j;
        }
        System.out.println(res);
    }
}
