package com.day2.variables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st integer: ");
        int a = sc.nextInt();
        System.out.print("2nd integer: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.printf("Average: %.2f\n", (a + b) / 2);
        System.out.println("Distance: " + Math.abs(a - b));
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
    }
}
