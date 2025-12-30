package com.day5.ControleStatements2;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input the 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double avg = sum / 5.0;
        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The Average is: " + avg);

	}

}
