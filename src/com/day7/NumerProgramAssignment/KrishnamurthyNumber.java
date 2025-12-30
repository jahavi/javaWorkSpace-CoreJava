package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class KrishnamurthyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1, i = 1;
            while (i <= digit) {
                fact = fact * i;
                i++;
            }
//            for(int i)
            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("Krishnamurthy Number");
        else
            System.out.println("Not a Krishnamurthy Number");
    }
}

