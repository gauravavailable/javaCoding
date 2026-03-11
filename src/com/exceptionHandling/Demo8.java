package com.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
// ========================FILENOTFOUNDEXCEPTION====================================
public class Demo8 {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            FileReader f = new FileReader("path of any file");
            System.out.println("Reading data");
        }catch (FileNotFoundException e) {
            System.out.println("Handled");
        }
        System.out.println("main ends");
    }
}
