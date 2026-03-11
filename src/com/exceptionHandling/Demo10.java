package com.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo10 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("handled");
        }
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        FileReader f = new FileReader("path of any file");
    }
}
