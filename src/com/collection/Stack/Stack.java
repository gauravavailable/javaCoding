package com.collection.Stack;

public class Stack {

    private int top = -1;
    private int size = 5;
    private Object[] arr = new Object[size];

    public void push(Object ele) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = ele;
    }

    public Object pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        Object ele = arr[top];
        arr[top] = null;
        top--;
        return ele;
    }

    public Object peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return null;
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
