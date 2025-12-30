package com.day2.variables;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in inches: ");
        double height = sc.nextDouble();

        double bmi = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);
        System.out.println("Body Mass Index is " + bmi);
    }
}
