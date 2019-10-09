package com.github.hcsp;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Complete createDoublyLinkedList() method to make the program output "3,2,1"
        // 补全createDoublyLinkedList()使得程序输出"3,2,1"
        LinkedListNode head = createDoublyLinkedList();
        LinkedListNode tail = head.next.next;
        System.out.println("" + tail.value + "," + tail.prev.value + "," + tail.prev.prev.value);
    }

    // Create a doubly linked list: 1 ⇋ 2 ⇋ 3 and return the head node
    // 创建一个这样的双向链表：1 ⇋ 2 ⇋ 3 并返回头节点
    public static LinkedListNode createDoublyLinkedList() {
        LinkedListNode head = createNode(1);
        LinkedListNode second = createNode(2);
        LinkedListNode third = createNode(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        return head;
    }

    static LinkedListNode createNode(int value) {
        LinkedListNode node = new LinkedListNode();
        node.prev = null;
        node.value = value;
        node.next = null;
        return node;
    }

}
