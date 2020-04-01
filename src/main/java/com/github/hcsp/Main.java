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

    /**
     * 粗暴的插入三个值是毫无美感的。
     *  只有使用递归来创建链表，才能体会到数据结构的原生乐趣！！！
     */

    public static LinkedListNode createDoublyLinkedList() {
        int[] data = {1, 2, 3};
        return createList(data, 0);

    }

    private static LinkedListNode createList(int[] data, int postion) {
        if (data.length == 0) {
            return null;
        }
        LinkedListNode node = new LinkedListNode();
        node.next = null;
        node.prev = null;
        if (postion == data.length - 1) {
            node.value = data[postion];
            return node;
        }
        LinkedListNode curNode = createList(data, postion + 1);
        node.next = curNode;
        node.value = data[postion];
        if (curNode != null) {
            curNode.prev = node;
        }
        return node;
    }
}
