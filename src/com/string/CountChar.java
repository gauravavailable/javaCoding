package com.string;

public class CountChar {
    public static void main(String[] args) {
        String s="JspiderS@12345";
        int uc=0,lc=0,nc=0,sp=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch>='A' && ch<='Z')
                uc++;
            else if (ch>='a' && ch<='z')
                lc++;
            else if (ch>='0' && ch<='9')
                nc++;
            else
                sp++;
        }
        System.out.println("uc="+uc);
        System.out.println("lc="+lc);
        System.out.println("nc="+nc);
        System.out.println("sp="+sp);
    }
}
