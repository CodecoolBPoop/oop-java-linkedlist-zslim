package com.codecool.linkedList;

public class LinkedList<T> {

    private class Node {

        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    public int length;

    public LinkedList() {
        length = 0;
    }

    public LinkedList(T[] values) {
        for (T value :
                values) {
            this.insert(value);
        }
    }

    public T getItemAt(int index) {
        Node currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void insert(T valueToInsert) {
        Node newNode = new Node(valueToInsert);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length = 1;
        } else {
            tail.next = newNode;
            tail = newNode;
            length += 1;
        }
    }

    public void remove(T valueToRemove) {
        Node currentNode = head;
        Node previousNode;

        while (!currentNode.next.data.equals(valueToRemove)) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode.equals(head)) {
            head = head.next;
        } else {
            previousNode.next = currentNode.next;
        }
    }
}
