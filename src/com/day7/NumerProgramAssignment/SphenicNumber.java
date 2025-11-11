//Number of three different number is prime numbres

package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class SphenicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int product = 1;
        int i = 2;

        while (num > 1 && i <= num) {
            if (num % i == 0 && isPrime(i)) {
                count++;
                product *= i;
                num = num / i;
            } else {
                i++;
            }
        }

        if (count == 3)
            System.out.println("Sphenic Number");
        else
            System.out.println("Not a Sphenic Number");
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        int j = 2;
        while (j <= n / 2) {
            if (n % j == 0)
                return false;
            j++;
        }
        return true;
    }
}
