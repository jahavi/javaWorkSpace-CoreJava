package com.day15.PolymorphismClasswork;

public class Calculations {
//	This is method overloading concept in java
	
	public void add(int a, int b) {
		// add method code 
	}
	
	public void add(int a, int b, int c) {
		// add method code 
	}
	public void add(double a, int b) {
		// add method code 
	}
	public void add(int a, double b) {
		// add method code 
	}
	public static void main(String[] args) {
		Calculations cal = new Calculations();
		cal.add(1, 2);
		cal.add(1, 2,3);
		System.out.println(1.2);
	}

}
