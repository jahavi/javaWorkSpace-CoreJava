//Even number of digits → split in half → (sum of halves)² = number
//Ex: 2025 → (20+25)=45 → 45²=2025
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digits = 0, temp = num;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        if (digits % 2 != 0) {
            System.out.println("Not a Tech Number");
            return;
        }
        int div =1;
        for (int i = 0; i < digits / 2; i++) {
            div = div * 10;
            //int div = 1;
        }

        int firstHalf = num / div;
        int secondHalf = num % div;
        int sum = firstHalf + secondHalf;

        if (sum * sum == num)
            System.out.println("Tech Number");
        else
            System.out.println("Not a Tech Number");
    }
}
