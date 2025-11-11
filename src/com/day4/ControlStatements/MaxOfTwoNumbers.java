package com.day4.ControlStatements;

import java.util.Scanner;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        int num1 = input.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int num2 = input.nextInt();
	        
	        int result = (num1 > num2) ? 1 : (num1 < num2 ? 2 : 0);
	        
	        switch (result) {
	            case 1:
	                System.out.println("Maximum number is: " + num1);
	                break;
	            case 2:
	                System.out.println("Maximum number is: " + num2);
	                break;
	            case 0:
	                System.out.println("Both numbers are equal.");
	                break;
	            default:
	                System.out.println("Invalid input");
	        }
	}

}