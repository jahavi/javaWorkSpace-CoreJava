package com.day19.FileIOAssignment;
import java.util.Scanner;
public class ConsoleRead {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text:");
        String s=sc.nextLine();
        System.out.println("You entered: "+s);
    }
}
