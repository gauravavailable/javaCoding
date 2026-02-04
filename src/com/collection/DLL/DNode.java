package com.collection.DLL;

public class DNode {
    Object ele;
    DNode prev;
    DNode next;

    public DNode(Object ele) {
        this.ele = ele;
        this.prev = null;
        this.next = null;
    }
}
