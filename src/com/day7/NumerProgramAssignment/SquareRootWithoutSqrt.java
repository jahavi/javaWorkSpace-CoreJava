package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class SquareRootWithoutSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        while (i * i <= num) {
            i++;
        }
        System.out.println("Square Root (floor value) = " + (i - 1));
    }
}
