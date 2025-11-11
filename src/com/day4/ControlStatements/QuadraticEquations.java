package com.day4.ControlStatements;

import java.util.Scanner;
public class QuadraticEquations {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double a = input.nextDouble();

	        double b = input.nextDouble();

	        double c = input.nextDouble();

	        double discriminant = b * b - 4 * a * c;

	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("The roots are " + root1 + " and " + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("The root is " + root);
	        } else {
	            double realPart = -b / (2 * a);
	            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
	            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and " 
	                               + realPart + " - " + imaginaryPart + "i");
	        }

	        }
	}
