package com.day5.ControleStatements2;

import java.util.Scanner;

public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = n - i; space > 0; space--) { 
            	System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) { 
            	System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) { 
            	System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int space = n - i; space > 0; space--) { 
            	System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) { 
            	System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) { 
            	System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
