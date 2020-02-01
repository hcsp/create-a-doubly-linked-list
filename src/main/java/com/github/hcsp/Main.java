package com.github.hcsp;

import java.util.ArrayList;
import java.util.Arrays;
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
        int[] valArr = new int[]{1,2,3};
        LinkedListNode head = new LinkedListNode();
        LinkedListNode node = head;
        node.value = valArr[0];

        for (int i=1; i<valArr.length; i++){
            int value = valArr[i];
            LinkedListNode currNode = new LinkedListNode();
            currNode.value = value;

            currNode.prev = node;
            node.next=currNode;

            node = currNode;
        }

        return head;
    }
}
