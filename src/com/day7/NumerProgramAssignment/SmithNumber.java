//A number whose sum of digits = sum of digits of prime factors
// 666 → 6+6+6=18, prime factors 2,3,3,37 → sum=18
//Check again problem 
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class SmithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sumDigits = sumOfDigits(num);
        int temp = num;
        int sumFactors = 0;
        int i = 2;

        while (temp > 1) {
            if (temp % i == 0) {
                sumFactors += sumOfDigits(i);
                temp = temp / i;
            } else {
                i++;
            }
        }

        if (sumDigits == sumFactors)
            System.out.println("Smith Number");
        else
            System.out.println("Not a Smith Number");
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}

