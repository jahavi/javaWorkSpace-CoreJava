package com.day4.ControlStatements;
import java.util.*;

public class VowelAndConsonant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter = input.next();
		
		if(letter.length()>1 || Character.isDigit(letter.charAt(0))) {
			System.out.println("This need to be a character only one letter");
		}else {
//			if((letter != "a"||letter!="e"||letter != "i"||letter != "o"||letter != "u")) {
//				System.out.println("This character is a Constant");
//				
//			}else {
//				System.out.println("This is a Vowel");
//			}
			
			switch(letter) {
			case "a":
				System.out.println("This is a Vowel");
				break;
			case "e":
				System.out.println("This is a Vowel");
				break;
			case "i":
				System.out.println("This is a Vowel");
				break;
			case "o":
				System.out.println("This is a Vowel");
				break;
			case "u":
				System.out.println("This is a Vowel");
				break;
			default:
				System.out.println("This is a Consonant");
				break;
			}
		}
		
	}

}
