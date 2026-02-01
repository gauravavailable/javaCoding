package com.string;

public class SubstringPallindrome {
    public static void main(String[] args) {
        String s="Banana";
        for (int i=0;i<s.length()-1;i++){
            for (int j=i+1;j<s.length();j++){
                if(isPallindrome(s,i,j)){
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }

    static boolean isPallindrome(String s,int start,int end){
        char[] a=s.toCharArray();
        int i=start, j=end;
        while (i<j){
            if (a[i++]!=a[j--]) return false;
        }
        return true;
    }
}
