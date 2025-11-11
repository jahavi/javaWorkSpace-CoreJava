package com.day4.ControlStatements;

import java.time.YearMonth;
import java.time.Month;

import java.util.*;
public class NumOfDaysInAMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yearNum = input.nextInt();
		int monthNum = input.nextInt();
		
		Month monthStr = Month.of(monthNum);
		YearMonth yr = YearMonth.of(yearNum, monthNum);
		
		System.out.println("Number of days in a Month of "+monthStr+" is "+yr.lengthOfMonth());
		
	}

}
