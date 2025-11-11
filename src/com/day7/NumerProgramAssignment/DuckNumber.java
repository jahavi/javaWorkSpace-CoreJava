//Number that have 0 in it but does not start with 0
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        if (num.charAt(0) == '0')
            System.out.println("Not a Duck Number");
        else {
            boolean hasZero = false;
            int i = 0;
            while (i < num.length()) {
                if (num.charAt(i) == '0') {
                    hasZero = true;
                    break;
                }
                i++;
            }
            if (hasZero)
                System.out.println("Duck Number");
            else
                System.out.println("Not a Duck Number");
        }
    }
}

