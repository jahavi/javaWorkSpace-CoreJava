package com.day13.ConstructorMethodKeyWdStaticThis;

public class ConstructorOverloading {
	
	int id;
	String name;
	int age;
	
	ConstructorOverloading(int i,String n){
		id =i;
		name=n;
	}
	ConstructorOverloading(int i,String n,int a){
		id=i;
		name=n;
		age =a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading s1 = new ConstructorOverloading(1111,"test");
		ConstructorOverloading s2 = new ConstructorOverloading(1122,"test1",25);
		s1.display();
		s2.display();
		
	}
	
}
