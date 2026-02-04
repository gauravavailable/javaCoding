package com.collection.DLL;

public class TestDLL {
    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();

        System.out.println("Size: " + list.size());
    }
}