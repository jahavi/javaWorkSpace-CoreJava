package com.day5.ControleStatements2;

import java.util.Scanner;

public class NumberRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space > 0; space--) { 
            	System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) { 
            	System.out.print(j);
            }
            for (int j = 2; j <= i; j++) { 
            	System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int space = n - i; space > 0; space--) { 
            	System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) { 
            	System.out.print(j);
            }
            for (int j = 2; j <= i; j++) { 
            	System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
