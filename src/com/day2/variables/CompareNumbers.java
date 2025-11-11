package com.day2.variables;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Signed comparison (a-b): " + (a - b));
        System.out.println("Unsigned comparison: " + Integer.compareUnsigned(a, b));
    }
}
