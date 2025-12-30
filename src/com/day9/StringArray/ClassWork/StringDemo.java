package com.day9.StringArray.ClassWork;

public class StringDemo {
	
	
	public static void main(String[] args) {
		String s1 ="Rama";
		String s2 ="Rama";
		System.out.println(s1==s2);	//True
		
		String s3 = new String("Rama");
		System.out.println(s1==s3);	//False Becasue the refrence is differernt
		System.out.println(s1.equals(s3));	//True
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.isEmpty());//false
		System.out.println("---------------------------");
		
		//Reverse of a string ,,,,
		//Case1: get the length
		//case2 : create a new empty to store
		//case 3 : loop for loop in reverse order
		// case 4 : use the chatAt() and check 
		
		
		System.out.println("---------------------------");
		// Check the string is Palindrome or not
		// Case1: reverse the string and compare them 
		
		System.out.println("---------------------------");
		// find the count of each character in the stirng 
		String str = "banana";
		char search = 'a';
		int count =0;
		for(char c : str.toCharArray()) {
			if(c==search) {
				count++;
			}
		}
		System.out.println(count);
	}
}
