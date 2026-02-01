package com.string;

public class UniqueChar {
    public static void main(String[] args) {
        String s="javadeveloper";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
           int count=1;
           if (ch[i]=='\u0000') continue;
           for (int j=i+1;j<s.length();j++){
               if (ch[i]==ch[j]){
                   count++;
                   ch[j]='\u0000';
               }
           }
           if (count==1)
               System.out.print(ch[i]);
        }
    }
}
