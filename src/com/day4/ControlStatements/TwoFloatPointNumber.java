package com.day4.ControlStatements;

import java.util.Scanner;

public class TwoFloatPointNumber {
	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		double num1=inputNum.nextDouble();
		double num2=inputNum.nextDouble();
		
		long n1 = (long)(num1*1000);
		long n2 = (long)(num2*1000);
		
		if (n1==n2) {
			System.out.println("Same number till three decinal numbers");
		}else {
			System.out.println("These are the different");
		}
		
		
		
	}
}
