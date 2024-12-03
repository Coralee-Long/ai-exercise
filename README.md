# Bubble Sort Example in Java

This is a simple Java program that demonstrates the **Bubble Sort algorithm**. It sorts an array of integers in ascending order and prints the array before and after sorting.

## Features

- Implements the Bubble Sort algorithm.
- Includes helper methods for swapping elements and printing arrays.
- Fully documented with comments for clarity.

## How It Works

1. The program initializes an array of integers.
2. It prints the original array.
3. The `sortArray` method is called, which uses Bubble Sort to sort the array in ascending order.
4. The sorted array is printed to the console.

## Code Overview

### Main Class: `BubbleSortExample`

#### Methods

1. **`main(String[] args)`**
    - Entry point of the program.
    - Prints the original and sorted arrays.

2. **`sortArray(int[] array)`**
    - Sorts the array using Bubble Sort.

3. **`swapElements(int[] array, int index1, int index2)`**
    - Swaps two elements in the array.

4. **`printArray(int[] array)`**
    - Prints the contents of the array to the console.

## Example Output
- Original Array: 5 2 9 1 5 6
- Sorted Array: 1 2 5 5 6 9

## How to Run

1. Clone this repository or copy the code into your project.
2. Compile and run the `BubbleSortExample` class using your IDE or terminal.

### Running with Terminal

1. Compile the code:
```bash
   javac BubbleSortExample.java
```
2. Run the compiled program:
```bash
   java BubbleSortExample
```

## Tests
**JUnit tests are included to ensure functionality:**

- `sortArray` handles unsorted, already sorted, empty, and single-element arrays.
- `swapElements` is tested to verify swapping functionality.

**Run the tests using a JUnit-compatible IDE or with Maven:**
```bash
   mvn test
```