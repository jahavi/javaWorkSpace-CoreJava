package com.day7.BasicProgrammingAssigment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Split string into array of characters
        String[] letters = word.split("");

        int length = letters.length;
        boolean isPalindrome = true;

        // Compare from start and end using if
        for (int i = 0; i < length / 2; i++) {
            if (!letters[i].equals(letters[length - i - 1])) {
                isPalindrome = false;
                break; // not a palindrome, stop checking
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome.");
        else
            System.out.println(word + " is not a Palindrome.");
    }
}
