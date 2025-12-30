// Object Creation within the class

package com.day12.ObjectsAndClass.ClassWork;

public class WithinClass {
	
	int id;
	String name;
	
	public static void main(String[] args) {
		
		WithinClass s1 = new WithinClass();
		
//		Accessing the members through reference variable
		
		System.out.println(s1.id+" "+s1.name);
	}

}
