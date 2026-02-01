package com.recursion;

import java.util.Scanner;
public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
       int a = sc.nextInt();
        System.out.println("Enter last Number ");
        int b= sc.nextInt();
        for(int i=a;i<=b;i++) {
            if (isPrime(i) && palindrome(i)) {
                System.out.println(i + " is Prime Palindrome");
            }
        }
    }
    public static boolean isPrime(int num){

        if(num <2)
            return false;
            for(int i =2;i<=Math.sqrt(num);i++){
                  if(num % i ==0)
                    return false;
            }
        return true;
        }

  public static boolean palindrome(int num){

        int temp =num;
        int sum =0;
        while(num >0){
            int d = num%10;
            sum =sum *10 +d;
            num /=10;
        }
        if(sum !=temp){
            return false;
        }
        return true;
  }
}

