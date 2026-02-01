package com.array;

public class Demo12 {
    public static void main(String[] args) {
        char [] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','u'};
        for(char m : a){
            if(m == 'a'|| m == 'e'|| m == 'i' || m == 'o' || m == 'u'){
                System.out.print(m + " ");
            }
        }

    }
}
