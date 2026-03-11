package com.collection.DLL;
public class Node {
    Object ele;
    Node next;
    Node prev;

    public Node(Object ele, Node next, Node prev) {
        super();
        this.ele = ele;
        this.next = next;
        this.prev = prev;
    }

    Node(Object ele) {
        this.ele = ele;
    }
}

