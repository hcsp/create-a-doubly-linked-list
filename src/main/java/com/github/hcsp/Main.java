package com.github.hcsp;

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
        LinkedListNode firstNode = createFirstDoublyLinkedList(1);
        addLast(2);
        addLast(3);
        return firstNode;
    }
    static LinkedListNode firstNode;
    private static LinkedListNode createFirstDoublyLinkedList(int value) {
        firstNode = new LinkedListNode();
        firstNode.value = value;
        firstNode.prev = firstNode;               // 头节点的prev永远指向最后一个节点。
        firstNode.next = null;
        return firstNode;
    }

    private static void addLast(int value) {
        LinkedListNode newLastLinkedListNode = new LinkedListNode();
        newLastLinkedListNode.value = value;
        newLastLinkedListNode.prev = firstNode.prev;
        newLastLinkedListNode.next = null;
        firstNode.prev.next = newLastLinkedListNode;     // 原本的最后一个节点的next 指向新的最后一个节点。
        firstNode.prev = newLastLinkedListNode;         // 更新头节点.prev 到最后一个节点。
    }
}
