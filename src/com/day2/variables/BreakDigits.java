package com.day2.variables;

import java.util.Scanner;

public class BreakDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        
        for (int i = 0; i < num.length(); i++) {
            System.out.print(num.charAt(i) + " ");
        }
    }
}
