package com.zhufeng.jdk8.leetcode.linkedlist;

/**
 * @author zf
 * @version 1.0
 * @date 2020-06-03
 */
public class MyLinkedList<E> implements MyList<E>{

    private Node<E> head;

    private int size;

    class Node<E> {

        private Node next;

        private E e;

        public Node(E e) {
            this.e = e;
        }

        public Node() {
        }
    }


    public MyLinkedList() {
        this.head = null;
    }

    public MyLinkedList(E e) {
        head = new Node(e);
        size++;
    }

    public MyLinkedList(Node<E> head) {
        this.head = head;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node dummyNode = new Node();
        dummyNode.next = head;

        Node cur = dummyNode;
        while((cur = cur.next) != null) {

            Object obj = cur.e;
            if (obj != null && obj.equals(o)) {
                return true;
            }

        }

        return false;
    }

    @Override
    public boolean add(E e) {
        Node dummyNode = new Node();
        dummyNode.next = head;

        Node cur = dummyNode;

        while(cur.next != null){
            cur = cur.next;
        };

        cur.next = new Node(e);
        size++;

        return true;

    }

    @Override
    public boolean remove(Object o) {
        Node dummyNode = new Node();
        dummyNode.next = head;

        Node cur = dummyNode;
        Node prev = null;



        return false;

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }


    public void print() {
        Node dummyNode = new Node();
        dummyNode.next = head;

        Node cur = dummyNode;
        while((cur = cur.next) != null) {

            System.out.print(cur.e + "->");

        }
    }


    public Node reverse(Node node) {

        Node next = null;
        Node prev = null;


        return null;
    }


    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(4);
        linkedList.add(104);
        linkedList.add(94);
        linkedList.add(84);
        linkedList.add(74);
        linkedList.add(64);
        System.out.println(linkedList.size);
        System.out.println(linkedList.contains(64));
        linkedList.print();

//        linkedList.reverse();

        linkedList.print();
    }
}
