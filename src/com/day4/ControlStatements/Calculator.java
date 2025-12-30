package com.day4.ControlStatements;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String operator = input.nextLine();
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		
		switch(operator) {
		case "+":
			System.out.println("Addition "+(num1+num2));
			break;
		case "-":
			System.out.println("Substraction "+(num1-num2));
			break;
		case "*":
			System.out.println("Multiplication "+(num1*num2));
			break;
			
		case "/":
			System.out.println("Division "+(num1/num2));
			break;
		default:
			System.out.println("No operator entered");
		}
		
		
	}

}
