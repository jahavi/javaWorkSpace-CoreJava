package com.day9.StringArray.ClassWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo {
	public static void main(String[] args) {
		String s = "12345"; // True
		System.out.println(s.matches("\\d+"));
		String s1 = "Hello";
		System.out.println(s1.matches("[a-zA-Z]+"));
		String mobile = "9100000000";
		System.out.println(mobile.matches("[6-9][0-9]{9}"));
		String str = "java developer";
		System.out.println(str.matches("^java.*"));
		System.out.println(str.matches(".*developer$"));
		System.out.println("522625".matches("\\d{6}"));
		
		String text = "This is my Order ID : 4567 and amount is 1500";
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			System.out.println("Found these numbers :"+matcher.group());
		}
	}

}
