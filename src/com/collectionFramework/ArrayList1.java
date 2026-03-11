package com.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        ArrayList a2 = new ArrayList();

        a2.addAll(a1);
        a2.add(60);
        a2.add(70);
        a2.add(80);
//        a2.remove(3);
        System.out.println(a2.containsAll(a1));
//        a2.remove(a1);
        a2.retainAll(a1);
        System.out.println(a1);
        System.out.println(a2);

    }

}
