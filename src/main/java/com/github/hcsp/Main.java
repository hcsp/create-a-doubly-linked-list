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
        LinkedListNode linkedListNode1 = new LinkedListNode();
        LinkedListNode linkedListNode2 = new LinkedListNode();
        LinkedListNode linkedListNode3 = new LinkedListNode();

        linkedListNode1.value = 1;
        linkedListNode2.value = 2;
        linkedListNode3.value = 3;

        linkedListNode1.next = linkedListNode2;
        linkedListNode2.prev = linkedListNode1;
        linkedListNode2.next = linkedListNode3;
        linkedListNode3.prev = linkedListNode2;

        return linkedListNode1;
    }
}
