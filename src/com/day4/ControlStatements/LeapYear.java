package com.day4.ControlStatements;

import java.util.Scanner;
import java.time.Month;
import java.time.YearMonth;

public class LeapYear {
	public static void main(String[] args) {
		Scanner inputYr = new Scanner(System.in);
		int yr = inputYr.nextInt();
		YearMonth yearcheck = YearMonth.of(yr, 2);
		if(yearcheck.isLeapYear()) {
			System.out.println("This is Leap Year");
		}else {
			System.out.println("This is not a Leap Year");
		}
		
	}

}
