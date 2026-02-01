package com.string;

public class CountVowel {
    public static void main(String[] args) {
        String s="airospace";
        int vowel=0,consonant=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else {
                    consonant++;
                }
            }
            System.out.println("String:"+s);
            System.out.println("Vowels : " + vowel);
            System.out.println("Consonants : " + consonant);
        }
    }
}
