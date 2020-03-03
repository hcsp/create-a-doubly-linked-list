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
        LinkedListNode firstNode = new LinkedListNode();
        LinkedListNode secondNode = new LinkedListNode();
        LinkedListNode thirdNode = new LinkedListNode();
        firstNode.value = 1;
        secondNode.value = 2;
        thirdNode.value = 3;
        firstNode.next = secondNode;
        secondNode.prev = firstNode;
        secondNode.next = thirdNode;
        thirdNode.prev = secondNode;
        return firstNode;
    }
}
