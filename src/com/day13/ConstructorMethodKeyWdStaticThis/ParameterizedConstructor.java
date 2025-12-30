// Even when the constructor is not defined 

package com.day13.ConstructorMethodKeyWdStaticThis;

public class ParameterizedConstructor {
	
	int id;
	String name;
	
	ParameterizedConstructor(int i,String n){
		id=i;
		name= n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor s1 = new ParameterizedConstructor(111,"karan");
		s1.display();
	}
}
