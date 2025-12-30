package com.day4.ControlStatements;

import java.util.Scanner;


public class WeekdayNames {

	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		int num = inputNum.nextInt();
		String weekName;
		switch(num) {
		case 1:
			weekName = "Monday";
			System.out.println(weekName);
			break;
		case 2:
			weekName = "Tueday";
			System.out.println(weekName);
			break;
		case 3:
			weekName = "Wednesday";
			System.out.println(weekName);
			break;
		case 4:
			weekName = "Thrusday";
			System.out.println(weekName);
			break;
		case 5:
			weekName = "Friday";
			System.out.println(weekName);
			break;
		case 6:
			weekName = "Saturday";
			System.out.println(weekName);
			break;
		case 7:
			weekName = "Sunday";
			System.out.println(weekName);
			break;
		default:
			weekName = "Invalid";
			System.out.println(weekName);
			break;
		}
	}

}
