package com.string;

public class ConsecutiveNo {
    public static void main(String[] args) {
        String s="a45g67g35";
        char[] a=s.toCharArray();
        int sum=0 ,num=0;
        for (char c:a) {
            if(c>='0' && c<='9'){
                num=(num*10)+(c-'0');
            }
            else{
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}
