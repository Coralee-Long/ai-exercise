package com.exercise;

public class Main {
    public static void main(String[] args) {
        // Test the palindrome check method
        System.out.println("Testing checkPalindrome method:");
        Exercises.checkPalindrome("anna");
        Exercises.checkPalindrome("Hello");
        Exercises.checkPalindrome("A man a plan a canal Panama");

        // Test the generatePrimes method
        System.out.println("\nTesting generatePrimes method:");
        Exercises.generatePrimes(10); // Change the number to test with different values

    }
}