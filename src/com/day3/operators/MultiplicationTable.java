package com.day3.operators;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner numberInput = new Scanner(System.in);
		int number = numberInput.nextInt();
		for(int i=0;i<10;i++) {
			System.out.println(number+"x"+(i+1)+"="+number*(i+1)+"");
		}
	}
}
