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
        LinkedListNode head = getNewNode(1);
        insertNodes(head, new int[]{2, 3});

        return head;
    }

    private static LinkedListNode getNewNode(int i) {
        LinkedListNode head = new LinkedListNode();
        head.value = i;
        return head;
    }

    private static void insertNodes(LinkedListNode head, int[] array) {
        LinkedListNode current = head;
        for (int value : array) {
            LinkedListNode newNode = getNewNode(value);
            current.next = newNode;
            newNode.prev = current;
            current = current.next;
        }
    }
}
