// way 2 is method initializer

package com.day12.ObjectsAndClass.ClassWork;

class StudentMethod{
	int rollno;
	String name;
	
	void insertRecord(int rollno,String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void displayValues() {
		System.out.println(rollno+" "+name);
	}
}

public class MethodInitializer {
	
	public static void main(String[] args) {
		StudentMethod s1 = new StudentMethod();
		StudentMethod s2 = new StudentMethod();
		
		s1.insertRecord(1, "Test1");
		s2.insertRecord(2, "Test2");
		
		s1.displayValues();
		s2.displayValues();
	}
}
