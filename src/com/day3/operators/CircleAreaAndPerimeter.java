package com.day3.operators;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
	public static void main(String[] args) {
		Scanner inputRadius = new Scanner(System.in);
		float radius = inputRadius.nextFloat();
		float circleArea = (float) (2*3.14*radius);
		double circlePerimeter = 3.14*radius * radius;
		System.out.println("Circle Area is "+ circleArea +" Perimeter is "+circlePerimeter);
		
	}
}
