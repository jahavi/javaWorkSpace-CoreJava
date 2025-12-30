package com.day8.arrays.Assignmnets8;

public class FindIndexOfArray {

	public static void main(String[] args) {

		String[] testArray = {"apple","mango","banana","pinapple"};
		String searchElement = "banana";
		int sum = 0;

		for(String i: testArray) {
			if(searchElement == i) {
				System.out.println("Index value is :"+sum);
				break;
			}else {
				sum++;
			}
		}
	}

}
