package com.collection;

public class LinkedList {
    Node head;
    int count = 0;
    public void add(Object ele){
        Node n = new Node(ele);
        if(head == null){
            head = n;
            count ++;
            return;
        }

        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = n;
        count++;
    }

    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public void display(){
        Node curr = head;
        while (curr != null){
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }
}
