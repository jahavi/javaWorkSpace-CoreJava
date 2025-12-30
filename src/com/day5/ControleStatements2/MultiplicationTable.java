package com.day5.ControleStatements2;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int n = sc.nextInt();
        System.out.print("number of terms: ");
        int terms = sc.nextInt();
        for (int i = 0; i <= terms; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
	}
}
