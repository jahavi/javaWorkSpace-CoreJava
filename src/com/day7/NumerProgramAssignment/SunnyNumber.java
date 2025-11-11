//If num + 1 is a perfect square some likee  8 → 8+1=9 → √9=3 → Sunny
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num + 1;
        int i = 1;
        boolean isSunny = false;
        //boolean sunnyy
        while (i * i <= n) {
            if (i * i == n) {
                isSunny = true;
                break;
            }
            i++;
        }

        if (isSunny)
            System.out.println("Sunny Number");
        else
            System.out.println("Not a Sunny Number");
    }
}
