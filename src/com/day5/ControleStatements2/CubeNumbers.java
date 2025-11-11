package com.day5.ControleStatements2;

import java.util.Scanner;

public class CubeNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + (i * i * i));
        }
	}
}
