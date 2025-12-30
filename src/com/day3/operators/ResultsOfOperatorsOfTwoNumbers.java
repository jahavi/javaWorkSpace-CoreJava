package com.day3.operators;

import java.util.Scanner;

public class ResultsOfOperatorsOfTwoNumbers {
	public static void main(String[] args) {
		Scanner inputNum1 = new Scanner(System.in);
		float num1 = inputNum1.nextFloat();
		Scanner inputNum2 = new Scanner(System.in);
		float num2 = inputNum2.nextFloat();
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"x"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"mod"+num2+"="+(num1%num2));
		
	}
}
