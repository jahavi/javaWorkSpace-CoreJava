// Object Initiaze
// Means assigning data into the object 
//3 ways to do this 
// reference variable
//method
// constructor

package com.day12.ObjectsAndClass.ClassWork;

class Student{
	int id;
	String name;
}

public class ReferenceVariableInitialization {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.id = 100;
		s1.name = "Test";
		
		System.out.println(s1.id+" "+s1.name);
	}
}

