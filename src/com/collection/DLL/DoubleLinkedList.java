package com.collection.DLL;

public class DoubleLinkedList {
    Node head;
    int count=0;
    Node tail;

    public void addFirst(Object ele){
        Node n =  new Node(ele);
        n.next =  head;
        head.prev = n ;
        head =n;
        count++;
    }

    public void addIndex(Object ele,int index) {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        if(index == 0){
            addFirst(ele);
            return;
        }
        if(index == size()){
            addLast(ele);
            return;
        }
        Node n = new Node(ele);
        Node curr = head;
        for (int i = 1; i<index; i++)
            curr = curr.next;
        n.next = curr.next;
        n.prev = curr;
        curr.next = n;
        count++;
    }

    public void addLast(Object ele){
        Node n = new Node(ele);
        tail.next = n;
        n.prev =  tail;
        tail = n;
        count++;
    }

    public void removeFirst(){
        head = head.next;
        head.prev = null;
        count--;
    }

    public void remove(int index)
    {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        if(index == 0){
            removeFirst();
            return;
        }
        if(index == size()-1){
            removeLast();
            return;
        }
        Node curr = head;
        for(int i = 1; i< index ; i++)
            curr =  curr.next;
        curr.next.next.prev = curr;
        curr.next = curr.next.next;
        count--;
    }


    public void removeLast(){
        tail = tail.prev;
        tail.next =  null;
        count--;
    }

    public boolean contains(Object ele) {
        Node curr = head;
        while(curr!=null) {
            if(curr.ele.equals(ele));
            curr = curr.next;
            return true;
        }
        return false;
    }

    public void add(Object ele) {
        Node n= new Node (ele);
        if (head==null) {
            head=n;
            tail=head;
            count++;
        }
        Node curr = head;
        while(curr.next!=null)
            curr = curr.next;
        curr.next=n;
        n.prev = curr;
        tail=n;
        count++;
    }
    public int size() {
        return count;
    }
    public void display() {
        Node curr = head;
        while(curr!=null) {
            System.out.println(curr.ele);
            curr=curr.next;
        }
    }
    public void revDisplay() {
        Node curr=tail;
        while(curr!=null) {
            System.out.println(curr.ele);
            curr = curr.prev;
        }
    }
    }

