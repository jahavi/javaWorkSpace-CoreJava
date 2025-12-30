package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class GCDTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number: ");
        int a = sc.nextInt();
        System.out.print("second number: ");
        int b = sc.nextInt();

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("GCD = " + a);
    }
}
