package com.day5.ControleStatements2;

import java.util.Scanner;

public class AtTheRateTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space > 0; space--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("@");
            System.out.println();
        }
        sc.close();
    }
}
