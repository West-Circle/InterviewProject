package org.interview.common.code;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // insert method
    public void insert(int value) {
        if (value <= this.value) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
            } else {
                this.right.insert(value);
            }
        }
    }
}

public class TreeTraversal {
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOder(Node root) {
        if (root == null) {
            return;
        }
        inOder(root.left);
        System.out.print(root.value + " ");
        inOder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        // binary tree
        /*
         * Node root = new Node(1);
         * root.left = new Node(2);
         * root.right = new Node(3);
         * root.left.left = new Node(4);
         * root.left.right = new Node(5);
         * root.right.left = new Node(6);
         * root.right.right = new Node(7);
         */
        Node root = new Node(4);
        root.insert(1);
        root.insert(2);
        root.insert(3);
        root.insert(5);
        root.insert(6);
        root.insert(7);
        // traversal
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.print("\nInOrder: ");
        inOder(root);
        System.out.print("\nPostOrder: ");
        postOrder(root);
        System.out.println();
    }
}