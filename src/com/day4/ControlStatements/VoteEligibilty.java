package com.day4.ControlStatements;

import java.util.Scanner;

public class VoteEligibilty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();
		int aadharNumber = input.nextInt();
//		int eligibleAge = 18;
		int validAadharNumeber = 1234;
		if(aadharNumber== validAadharNumeber) {
			if (age>=18) {
				System.out.println("You are eligible to vote");
			} else {
				System.out.println("You are not eligible to vote");
			}
		}else {
			System.out.println("This is not a valid aadhar number");
		}

	}

}
