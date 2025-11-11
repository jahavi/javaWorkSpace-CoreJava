package com.day4.ControlStatements;

import java.util.Scanner;

public class GradingRemarks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int marks = input.nextInt();
		int percentileMark = marks/10;
		switch(percentileMark) {
		case 10:
			System.out.println("OutStanding, A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B+");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C+");
			break;
		case 5:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		case 3:
			System.out.println("You didnot go through the Exam");
			break;
		default:
			System.out.println("No input");
		}
	}

}
