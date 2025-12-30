// Outside the class 

package com.day12.ObjectsAndClass.ClassWork;


class Student{
	int id;
	String name;
}

public class OutsideClass {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.id+" "+s1.name);
	}

}
