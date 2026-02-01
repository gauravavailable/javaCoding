package com.string;

public class RevSen {
    public static void main(String[] args) {
        String s = "Java Is Easy";
        String res = "";
        int i = s.length() - 1;
        int j = s.length() - 1;
        while (j >= 0) {
            while (j >= 0 && s.charAt(j) != ' ')
                j--;
            int k = j + 1;
            while (k <= i) {
                res += s.charAt(k);
                k++;
            }
            if (j >= 0)
                res += " ";
            j--;
            i = j;
        }
        System.out.println(res);
    }
}
