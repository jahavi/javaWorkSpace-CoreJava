//Assignment2-13
package com.day3.operators;

import java.util.Scanner;

public class RectangleAreaAndPerimeter {
	public static void main(String[] args) {
		Scanner inputWidth = new Scanner(System.in);
		float width = inputWidth.nextFloat();
		Scanner inputHeight = new Scanner(System.in);
		float height = inputHeight.nextFloat();
		float rectArea = width * height;
		float rectPerimeter = 2*(width + height);
		System.out.println("Rectangle Area is "+ rectArea +" Perimeter is "+rectPerimeter);
		
	}

}
