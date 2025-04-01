package edu.kis.vh.nursery.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntLinkedListTest {

    @Test
    public void testPushAndPop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(-1, list.pop());

        list.push(1);
        assertEquals(1, list.pop());

        list.push(2);
        assertEquals(2, list.pop());

        list.push(2);
        list.push(3);
        list.push(4);

        assertEquals(4, list.pop());
        assertEquals(3, list.pop());
        assertEquals(2, list.pop());

        assertEquals(-1, list.pop());

    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        assertTrue(list.isEmpty());
        list.push(1);
        assertFalse(list.isEmpty());
        list.push(2);
        assertFalse(list.isEmpty());
        list.pop();
        list.pop();
        assertTrue(list.isEmpty());

    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        assertFalse(list.isFull());
        list.push(1);
        assertFalse(list.isFull());
    }


    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(-1, list.top());

        list.push(1);
        assertEquals(1, list.top());

        list.push(2);
        list.push(3);
        assertEquals(3, list.top());

        list.pop();
        assertEquals(2, list.top());

        list.pop();
        assertEquals(1, list.top());

        list.pop();
        assertEquals(-1, list.top());
    }
}