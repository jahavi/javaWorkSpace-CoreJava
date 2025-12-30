//Automorphic Numbers are like 5 square is 25 ends with 5 same same 
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        boolean isAuto = true;

        while (num > 0) {
            if (num % 10 != square % 10) {
                isAuto = false;
                break;
            }
            num = num / 10;
            square = square / 10;
        }

        if (isAuto)
        	
        	
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
