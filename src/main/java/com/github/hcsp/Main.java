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
        LinkedListNode head = getHead(1);
        createLinkedList(head, 2, 3);
        return head;
    }

    private static LinkedListNode getHead(int value) {
        LinkedListNode head = new LinkedListNode();
        head.value = value;
        head.prev = null;
        return head;
    }

    private static void createLinkedList(LinkedListNode head, int... values) {
        LinkedListNode current = head;

        for (int value : values) {
            LinkedListNode next = new LinkedListNode();
            next.value = value;
            next.prev = current;
            current.next = next;
            current = next;
        }
    }
}
