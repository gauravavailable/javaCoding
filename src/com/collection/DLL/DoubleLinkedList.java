package com.collection.DLL;

public class DoubleLinkedList {
        DNode head;
        DNode tail;
        int count = 0;

        public void add(Object ele) {
            DNode n = new DNode(ele);

            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
            count++;
        }

        public int size() {
            return count;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public void displayForward() {
            DNode curr = head;
            while (curr != null) {
                System.out.println(curr.ele);
                curr = curr.next;
            }
        }

        public void displayBackward() {
            DNode curr = tail;
            while (curr != null) {
                System.out.println(curr.ele);
                curr = curr.prev;
            }
        }
    }

