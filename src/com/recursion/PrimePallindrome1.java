package com.recursion;
public class PrimePallindrome1 {
        static boolean isPrime(int n, int i) {
            if (n < 2) return false;
            if (i > Math.sqrt(n)) return true;
            if (n % i == 0) return false;
            return isPrime(n, i+1);
        }
        static int reverse(int n, int rev) {
            if (n == 0) return rev;
            return reverse(n / 10, rev * 10 + (n % 10));
        }
        static boolean isPalindrome(int n) {
            return n == reverse(n, 0);
        }
        public static void main(String[] args) {
            if (isPrime(11, 2) && isPalindrome(11))
                System.out.println(11 + " is Prime Palindrome");
             else
                System.out.println(11 + " is NOT Prime Palindrome");
        }
    }