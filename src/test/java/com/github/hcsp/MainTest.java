package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void linkedListTest() {
        LinkedListNode l = Main.createLinkedList();
        assertEquals(1, l.value);
        assertEquals(2, l.next.value);
        assertEquals(3, l.next.next.value);
        assertEquals(null, l.next.next.next);
        assertTrue(l.next.prev == l);
        assertTrue(l.next.next.prev == l.next);
    }
}
