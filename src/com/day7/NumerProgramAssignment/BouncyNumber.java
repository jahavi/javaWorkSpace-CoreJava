//strictly increaseing or decreasing number like 123 increaseing 321 decreaseing numbers

package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean inc = false, dec = false;
        int last = num % 10;
        num = num / 10;

        while (num > 0) {
            int digit = num % 10;
            if (digit < last)
                inc = true;
            else if (digit > last)
                dec = true;
            last = digit;
            num = num / 10;
        }

        if (inc && dec)
            System.out.println("Bouncy Number");
        else
            System.out.println("Not a Bouncy Number");
    }
}
