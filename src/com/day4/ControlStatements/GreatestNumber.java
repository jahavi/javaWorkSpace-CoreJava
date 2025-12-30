package com.day4.ControlStatements;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a>b) {
        	if (a>c) {
        		System.out.println("The greatest value is "+a);
        	}else if(c>a) {
        		System.out.println("The greatest value is "+c);
        	}
        }else if(b>a) {
        	if(b>c) {
        		System.out.println("The greatest value is "+b);
        	}else if(c>b) {
        		System.out.println("The greatest value is "+c);
        	}
        }
	}
}
