package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class SwapNumbersBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number: ");
        int a = sc.nextInt();
        System.out.print("second number: ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After: a = " + a + ", b = " + b);
    }
}
