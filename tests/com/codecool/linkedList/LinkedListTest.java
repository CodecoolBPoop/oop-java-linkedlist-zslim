package com.codecool.linkedList;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    public void testToString() {
        LinkedList<Integer> integerList = getLinkedListOfInts(5);
        String result = "0 1 2 3 4";
        assertEquals(result, integerList.toString());
    }

    @Test
    public void testConstructorWithParameter() {
        Integer[] intArray = {0, 1, 2, 3, 4, 5, 6};
        LinkedList<Integer> linkedList = new LinkedList(intArray);
        String result = "0 1 2 3 4 5 6";
        assertEquals(result, linkedList.toString());
    }

    private LinkedList<Integer> getLinkedListOfInts(int size) {
        Integer[] intArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            intArray[i] = i;
        }

        return new LinkedList<>(intArray);

    }
}