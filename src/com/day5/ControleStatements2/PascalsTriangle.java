package com.day5.ControleStatements2;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
        	
            for (int space = rows; space > i; space--) {
            	System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
