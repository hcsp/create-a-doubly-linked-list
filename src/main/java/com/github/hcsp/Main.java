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
        LinkedListNode head = createNode(1);
        LinkedListNode node2 = createNode(2);
        LinkedListNode node3 = createNode(3);
        setNodePoint(head, null, node2);
        setNodePoint(node2, head, node3);
        setNodePoint(node3, node2, null);
        return head;
    }

    public static LinkedListNode createNode(int value) {
        LinkedListNode node = new LinkedListNode();
        node.value = value;
        return node;
    }

    public static void setNodePoint(LinkedListNode node, LinkedListNode preNode, LinkedListNode nextNode) {
        node.prev = preNode;
        node.next = nextNode;
    }

}
