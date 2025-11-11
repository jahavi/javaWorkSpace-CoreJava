//
package com.test;

import java.util.Scanner;

public class ReverseOfTheNumber {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String inputNumber = input.next();
//		int number = 109;
//		String concNumber ;
		////
		String inputNumber = "210";
	String[] splitNum = inputNumber.split("");
//	System.out.println(splitNum[0]);
	for(int i = inputNumber.length()-1;i>=0;i--) {
		System.out.print(splitNum[i]);
	}
		int number = 1230;
		int reverseValue =0;
		while(number!=0) {
			int digit = number%10;
			reverseValue = reverseValue*10 +digit;
			number = number/10;
		}
		System.out.println(reverseValue);
		
	}

}
