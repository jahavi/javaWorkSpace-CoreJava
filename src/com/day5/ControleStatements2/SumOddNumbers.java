package com.day5.ControleStatements2;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of terms is:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("odd numbers:");
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);
      
    }
}
