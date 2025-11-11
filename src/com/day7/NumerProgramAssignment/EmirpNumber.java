//A num that is prime and also its reverse is also prime 
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class EmirpNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0, temp = num;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
//        for(int i;)
        if (isPrime(num) && isPrime(rev))
            System.out.println("Emirp Number");
        else
            System.out.println("Not an Emirp Number");
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
