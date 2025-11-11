//Assignment2-15
package com.day3.operators;

public class SwapTwoVariablesA {
	public static void main(String[] args) {
		int avalue = 10;
		int bvalue = 20;
		int temp;
		temp = bvalue;
		bvalue = avalue;
		avalue = temp;
		System.out.println("avalue is "+avalue+" and bvalue is "+bvalue+"");
	}
}
