package com.github.hcsp;

public class LinkedListNode {
    public LinkedListNode prev;
    public int value;
    public LinkedListNode next;

    public LinkedListNode(LinkedListNode prev, int value, LinkedListNode next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }
}
