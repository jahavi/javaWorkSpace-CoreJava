// Summ Of the Factorials of the digits = number like 145 == 1! +4! +5! = 145
package com.day7.NumerProgramAssignment;


import java.util.Scanner;


public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
       
        
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (num > 0) {
           //int d1
        	int digit = num % 10;
            int fact = 1;
            int i = 1;
            while (i <= digit) {
                fact = fact * i;
                i++;
            }
//            sum +=
            sum = sum + fact;
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("Peterson Number");
        else
            System.out.println("Not a Peterson Number");
    }
}
