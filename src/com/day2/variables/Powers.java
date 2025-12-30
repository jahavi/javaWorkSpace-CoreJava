package com.day2.variables;

import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.printf("Square: %.2f\n", num * num);
        System.out.printf("Cube: %.2f\n", num * num * num);
        System.out.printf("Fourth power: %.2f\n", num * num * num * num);
    }
}
