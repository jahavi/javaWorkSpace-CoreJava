package com.day5.ControleStatements2;

import java.util.Scanner;

public class NaturalNumbersSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        System.out.println("The first n natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto n terms: " + sum);
	}

}
