package com.collection.DLL;
import java.util.List;

public class TestDLL {
    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        list.add(10);
        list.add(20);
        list.add(25);
        list.add(30);

        System.out.println("Size: " + list.size());


    }
}