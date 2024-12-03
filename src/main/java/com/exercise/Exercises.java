package com.exercise;

public class Exercises {

    // Method to check if a string is a palindrome
    public static void checkPalindrome(String str) {
        // Remove case sensitivity and any extra spaces
        String cleaned = str.toLowerCase().replaceAll("\\s+", "");

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check if the original and reversed strings are equal
        if (cleaned.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to generate the first n prime numbers
    public static void generatePrimes(int n) {
        if (n <= 0) {
            System.out.println("Please provide a positive integer greater than 0.");
            return;
        }

        int count = 0; // Number of primes found
        int number = 2; // Start checking from 2
        System.out.println("The first " + n + " prime numbers are:");

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println(); // Move to the next line after printing all primes
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

