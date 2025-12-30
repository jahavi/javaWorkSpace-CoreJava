package com.day2.variables;

import java.util.Scanner;

public class ConvertFmFaheitToCelsius {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fahrenheitValue = input.nextInt();
		int celsiusValue = fahrenheitValue-112;
		
		System.out.println(celsiusValue);
		input.close();
	}
}
