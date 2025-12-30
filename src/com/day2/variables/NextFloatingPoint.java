package com.day2.variables;

import java.util.Scanner;

public class NextFloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();

        double nextUp = Math.nextUp(num);
        double nextDown = Math.nextDown(num);

        System.out.println("Nextup: " + nextUp);
        System.out.println("Nextdown: " + nextDown);
    }
}
