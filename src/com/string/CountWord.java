package com.string;

public class CountWord {
        public static void main(String[] args) {
            String s = "Java Is very Easy";
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ')
                    count++;
            }
            System.out.println("No of words = " + count);
        }
    }