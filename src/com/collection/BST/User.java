package com.collection.BST;

public class User {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.add(50);
        b.add(30);
        b.add(10);
        b.add(40);
        b.add(70);
        b.add(60);
        b.add(90);
        System.out.println(b.size());
        b.preOrder();
        System.out.println();
        b.postOrder();
        System.out.println();
        b.inOrder();
    }
}