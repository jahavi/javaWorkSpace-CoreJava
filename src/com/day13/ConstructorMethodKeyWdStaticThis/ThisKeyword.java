package com.day13.ConstructorMethodKeyWdStaticThis;

public class ThisKeyword {
	int rollno;
	String name;
	float fee;
	ThisKeyword(int rollno,String name,float fee){
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	public static void main(String[] args) {
		ThisKeyword s1 = new ThisKeyword(111,"Test1",100000f);
		s1.display();
	}
	
}
