package com.day2.variables;

import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long minutes = sc.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
