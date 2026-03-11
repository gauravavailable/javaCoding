//package com.comparator;
//
//import com.comparableInterface.Emp;
//
//import java.util.Arrays;
//
//public class EmpDriver {
//    public static void main(String[] args) {
//        Emp e1 = new Emp("Gaurav", 29, 1);
//        Emp e2 = new Emp("Aman", 22, 3);
//        Emp e3 = new Emp("Kartik", 39, 2);
//        Emp e4 = new Emp("Aarav", 39, 4);
//
//        Emp[] e = {e1, e2, e3, e4};
//        Arrays.sort(e , new SortByAge());
//        for (Emp emp : e)
//            System.out.println(emp);
//        System.out.println("----------------------");
//
//        Arrays.sort(e , new SortById());
//        for (Emp emp : e)
//            System.out.println(emp);
//        System.out.println("----------------------");
//
//        Arrays.sort(e , new SortByName());
//        for (Emp emp : e)
//            System.out.println(emp);
//        System.out.println("----------------------");
//
//    }
//}
