//Concatenate n, n×2, and n×3 — must contain all digits 1–9 exactly once
//192 → 192384576
package com.day7.NumerProgramAssignment;

import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String str = "" + num + (num * 2) + (num * 3);
        boolean flag = true;

        for (char ch = '1'; ch <= '9'; ch++) {
            int count = 0;
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == ch)
                    count++;
                i++;
            }
            if (count != 1) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Fascinating Number");
        else
            System.out.println("Not a Fascinating Number");
    }
}
