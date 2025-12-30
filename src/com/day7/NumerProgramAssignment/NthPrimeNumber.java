package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0, num = 2;
        while (true) {
            if (isPrime(num))
                count++;
            if (count == n)
                break;
            num++;
        }

        System.out.println("The " + n + "th prime number is: " + num);
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
