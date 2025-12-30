package com.day4.ControlStatements;

import java.util.Scanner;

public class GenderCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inptGender = input.next();
		switch(inptGender) {
		case "F":
			System.out.println("Female");
			break;
		case "M":
			System.out.println("Male");
			break;
		}
	}

}
