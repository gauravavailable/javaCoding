package com.array;

public class Demo16 {
    public static void main(String[] args) {
        int [] a = {1,2,1,3,2,4,4,4,4,4};

        for (int i = 0; i < a.length; i++){
            int count = 1;
            if (a[i] == -1)
                continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}
