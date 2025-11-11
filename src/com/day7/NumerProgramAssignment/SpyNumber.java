//Sum of digits = Product of digits
//1124 → 1+1+2+4=8, 1×1×2×4=8
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }
//        sum =sum+ digit;


        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}
