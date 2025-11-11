package com.day2.variables;

import java.util.Scanner;

public class TestFinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();

        boolean isFinite = Double.isFinite(num);
        System.out.println("Is the number finite? " + isFinite);
    }
}
