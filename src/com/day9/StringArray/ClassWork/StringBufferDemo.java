package com.day9.StringArray.ClassWork;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer(); // StringBuilder -- java 1.5 ver later
		buf.append("Rama");
		buf.append(" Krishna");
		System.out.println(buf+" "+buf.reverse());
		
		System.out.println("--------------------------------");
		StringBuilder builder = new StringBuilder("Java"); 
		builder.insert(4, "Program");
		System.out.println(builder);
		
		builder.delete(2, 6);
		System.out.println(builder);
		builder.replace(4, 8, "test")
		
		//Palindrome
		
		String word = "madam";
		StringBuilder builder1 = new StringBuilder(word);
		if(word.equalsIgnoreCase(builder1.reverse().toString())) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
	}

}
