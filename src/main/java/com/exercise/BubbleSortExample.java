package com.exercise;

/**
 * A simple example of using the Bubble Sort algorithm to sort an array.
 */
public class BubbleSortExample {

    /**
     * The entry point of the program.
     * Prints the original and sorted arrays.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array:");
        printArray(numbers);

        sortArray(numbers);

        System.out.println("\nSorted Array:");
        printArray(numbers);
    }

    /**
     * Sorts the given array in ascending order using the Bubble Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void sortArray(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for multiple passes
        do {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    swapElements(array, i - 1, i);
                    swapped = true;
                }
            }
            n--; // Reduce the range for the next pass
        } while (swapped);
    }

    /**
     * Swaps the elements at two specified positions in the array.
     *
     * @param array The array in which elements need to be swapped.
     * @param index1 The index of the first element to be swapped.
     * @param index2 The index of the second element to be swapped.
     */
    static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Prints the contents of the given array to the console.
     *
     * @param array The array to be printed.
     */
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
