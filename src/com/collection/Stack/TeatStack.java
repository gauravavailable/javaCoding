package com.collection.Stack;

public class TeatStack {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack Elements:");
        st.display();

        System.out.println("Peek: " + st.peek());

        System.out.println("Popped: " + st.pop());

        System.out.println("After Pop:");
        st.display();
    }
}
