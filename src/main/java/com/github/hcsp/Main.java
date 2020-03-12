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
        List<LinkedListNode> linkedListNodes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            LinkedListNode node = new LinkedListNode();
            node.value = i + 1;
            linkedListNodes.add(node);
        }
        for (int i = 0; i < linkedListNodes.size(); i++) {
            if (i == 0) {
                linkedListNodes.get(i).prev = null;
                linkedListNodes.get(i).next = linkedListNodes.get(i + 1);
            } else if (i == linkedListNodes.size() - 1) {
                linkedListNodes.get(i).prev = linkedListNodes.get(i - 1);
                linkedListNodes.get(i).next = null;
            } else {
                linkedListNodes.get(i).prev = linkedListNodes.get(i - 1);
                linkedListNodes.get(i).next = linkedListNodes.get(i + 1);
            }
        }
        return linkedListNodes.get(0);
    }
}
