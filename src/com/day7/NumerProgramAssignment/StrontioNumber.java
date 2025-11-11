//num divisibkle by 4,7,9
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 4 == 0 && num % 7 == 0 && num % 9 == 0)
            System.out.println("Strontio Number");
        else
            System.out.println("Not a Strontio Number");
    }
}
