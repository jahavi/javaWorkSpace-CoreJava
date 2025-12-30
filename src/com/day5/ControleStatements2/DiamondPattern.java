package com.day5.ControleStatements2;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows (half diamond): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space > 0; space--) System.out.print(" ");
            for (int star = 1; star <= (2 * i - 1); star++) System.out.print("*");
            
            
            System.out.println();
        }
        
        
        for (int i = n - 1; i >= 1; i--) {
            for (int space = n - i; space > 0; space--) System.out.print(" ");
            
            for (int star = 1; star <= (2 * i - 1); star++) System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}



