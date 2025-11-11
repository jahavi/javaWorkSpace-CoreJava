package com.day2.variables;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
