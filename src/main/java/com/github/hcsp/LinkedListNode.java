package com.github.hcsp;

public class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public int value;

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode(int value) {
        this.value = value;
    }
}
