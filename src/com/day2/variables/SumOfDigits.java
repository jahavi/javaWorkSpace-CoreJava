package com.day2.variables;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of all digits is " + sum);
    }
}
