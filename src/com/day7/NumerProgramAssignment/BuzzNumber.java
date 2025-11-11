//Number divisible by 7 or ends by 7 -- 27 70
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}
