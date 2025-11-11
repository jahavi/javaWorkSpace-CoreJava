package com.day4.ControlStatements;

import java.util.Scanner;

public class AddSubMultDiv {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
//			String operator = input.nextLine();
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			System.out.printf("Addition: %d, Substration: %d, Multiplication: %d, Division: %d",num1+num2,num1-num2,num1*num2,num1/num2);
			
			
		}


}