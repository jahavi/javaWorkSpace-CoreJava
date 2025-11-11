package com.day4.ControlStatements;

import java.util.Scanner;

public class PositiveValue {
	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		int number = inputNumber.nextInt();
		if(number>=0) {
			System.out.println("This is a Positive Number");
		}else {
			System.out.println("This is a Negitive Number");
		}
	}
}
