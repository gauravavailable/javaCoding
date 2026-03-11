package com.collection.BST;

import com.sorting.QuickSort;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {
    Node root;
    int count = 0;
    boolean flag;

    public boolean add(int key) {
        flag = true;
        root = add(root, key);
        return flag;
    }

    public Node add(Node n, int key) {
        if (n == null) {
            n = new Node(key);
            count++;
            return n;
        }
        if (key < n.key) n.left = add(n.left, key);
        else if (key > n.key) n.right = add(n.right, key);
        else flag = false;
        return n;
    }

    public int size() {
        return count;
    }

    public void postOrder() {
        preOrder(root);
    }

    public void preOrder() {
        postOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void preOrder(Node n) {
        if (n == null) return;
        System.out.print(n.key + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public void postOrder(Node n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.key + " ");
    }

    public void inOrder(Node n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.key + " ");
        inOrder(n.right);
    }

    public void remove(int key) {
        root = remove(root, key);
    }

    public Node remove(Node n, int key) {
        if (n == null) return null;
        if (key < n.key) n.left = remove(n.left, key);
        else if (key > n.key) n.right = remove(n.right, key);
        else {
            if (n.left == null && n.right == null) return null;
            else if (n.left == null) {
                count--;
                return n.right;
            } else if (n.right == null) {
                count--;
                return n.left;
            } else {
                n.key = minEle(n.right);
                n.right = remove(n.right, n.key);
                n.key = maxEle(n.left);
                n.left = remove(n.left, n.key);
            }
        }
        return n;
    }

    public int minEle(Node n) {
        int min = n.key;
        while (n.left != null) {
            min = n.left.key;
            n = n.left;
        }
        return min;
    }

    public int maxEle(Node n) {
        int max = n.key;
        while (n.right != null) {
            max = n.right.key;
            n = n.right;
        }
        return max;
    }

    public void levelOrder() {
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.printf(n.key + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }
}



