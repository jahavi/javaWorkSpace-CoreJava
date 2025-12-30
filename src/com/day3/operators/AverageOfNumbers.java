//Assignment2-12
package com.day3.operators;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner inputNum1 = new Scanner(System.in);
		Scanner inputNum2= new Scanner(System.in);
		Scanner inputNum3= new Scanner(System.in);
		float num1= inputNum1.nextFloat();
		float num2= inputNum2.nextFloat();
		float num3= inputNum3.nextFloat();
		float sum = num1 +num2+num3;
		float sumOfAverage= sum/3;
		System.out.println("Average of sum of three numbers is "+ sumOfAverage);
	}
}

