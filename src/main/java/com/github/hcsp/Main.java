package com.github.hcsp;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<LinkedListNode> list = new ArrayList<>();
        list.add(createLinkedNode(1));
        list.add(createLinkedNode(2));
        list.add(createLinkedNode(3));
        createLinkedList(list);
        return list.get(0);
    }

    public static void createLinkedList(ArrayList<LinkedListNode> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
            list.get(i + 1).prev = list.get(i);
        }
    }

    public static LinkedListNode createLinkedNode(int value) {
        LinkedListNode node = new LinkedListNode();
        node.value = value;
        return node;
    }
}
