package com.recursion;
import java.util.Scanner;
public class PrimePallindrome1 {

        static boolean isPrime(int n, int i) {
            if (n < 2) return false;
            if (i > Math.sqrt(n)) return true;
            if (n % i == 0) return false;
            return isPrime(n, i + 1);
        }
        static int reverse(int n, int rev) {
            if (n == 0)
                return rev;
            return reverse(n / 10, rev * 10 + (n % 10));
        }
        static boolean isPalindrome(int n) {
            return n == reverse(n, 0);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if (isPrime(n, 2) && isPalindrome(n)) {
                System.out.println(n + " is Prime Palindrome");
            } else {
                System.out.println(n + " is NOT Prime Palindrome");
            }
        }
    }

