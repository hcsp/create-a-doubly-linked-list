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
        LinkedListNode one = createNode(1);
        LinkedListNode two = createNode(2);
        LinkedListNode three = createNode(3);
        one.next = two;
        two.prev = one;
        two.next = three;
        three.prev = two;
        return one;
    }

    private static LinkedListNode createNode(int i) {
        LinkedListNode one = new LinkedListNode();
        one.value = i;
        return one;
    }
}
