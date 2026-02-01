package com.PatternProg;

public class ZigZag {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        String space=" ";
        for(int i=1;i<=n;i++){
           int start=star;
           int end=star+i-1;
           star=end+1;
           if(i%2==1){
               for(int x=start;x<=end;x++){
                   System.out.print(x+space);
               }
           }
           else{
               for(int x=end;x>=start;x--){
                   System.out.print(x+space);
               }
           }
            System.out.println();
        }
    }
}
