package com.zhufeng.jdk8.leetcode.stack;


/**
 * @author zf
 * @version 1.0
 * @date 2020-06-04
 */
public class LinkedStack {

    class Node<E> {

        private Node next;

        private E e;

        public Node(E e) {
            this.e = e;
        }

        public Node() {
        }
    }

    private Node head;
    int size;

    public LinkedStack(Node head) {
        this.head = head;
        size++;
    }

    public LinkedStack() {
    }


    public void push(Object o) {

        if (head == null) {
            head = new Node(o);
            size++;
            return;
        }

        Node cur = new Node();
        cur.next = head;
        while(cur.next != null) {
            cur = cur.next;
        }

        cur.next = new Node(o);
        size++;
    }

    public void pop() {
        if (size == 1) {
            head = null;
            size--;
            return;
        }
        Node cur = new Node();
        cur.next = head;
        Node prev = null;
        while(cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;

        size--;
    }

    public void print() {
        Node dummyNode = new Node();
        dummyNode.next = head;

        Node cur = dummyNode;
        while((cur = cur.next) != null) {

            System.out.print(cur.e + "->");

        }

        System.out.println();
    }


    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(3);
        stack.push(104);
        stack.push(94);
        stack.push(84);
        stack.push(74);
        stack.push(64);
        stack.print();

        stack.pop();
        stack.print();

    }
}
