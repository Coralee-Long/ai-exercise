package com.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortExampleTest {

    @Test
    void testSortArray_withUnsortedArray() {
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        BubbleSortExample.sortArray(input);
        assertArrayEquals(expected, input, "The array should be sorted in ascending order.");
    }

    @Test
    void testSortArray_withAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSortExample.sortArray(input);
        assertArrayEquals(expected, input, "The already sorted array should remain unchanged.");
    }

    @Test
    void testSortArray_withArrayContainingDuplicates() {
        int[] input = {3, 3, 2, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        BubbleSortExample.sortArray(input);
        assertArrayEquals(expected, input, "The array with duplicates should be sorted correctly.");
    }

    @Test
    void testSortArray_withSingleElementArray() {
        int[] input = {7};
        int[] expected = {7};
        BubbleSortExample.sortArray(input);
        assertArrayEquals(expected, input, "A single-element array should remain unchanged.");
    }

    @Test
    void testSortArray_withEmptyArray() {
        int[] input = {};
        int[] expected = {};
        BubbleSortExample.sortArray(input);
        assertArrayEquals(expected, input, "An empty array should remain unchanged.");
    }

    @Test
    void testSwapElements() {
        int[] array = {5, 3, 8};
        BubbleSortExample.swapElements(array, 0, 2);
        int[] expected = {8, 3, 5};
        assertArrayEquals(expected, array, "The elements at indices 0 and 2 should be swapped.");
    }
}
