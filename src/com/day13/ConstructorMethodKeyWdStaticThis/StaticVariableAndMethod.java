package com.day13.ConstructorMethodKeyWdStaticThis;


class StudentSVM{
	int rollno;
	String name;
	static String college ="ITS";
	
	StudentSVM(int r,String n){
		rollno = r;
		name = n;
	}
	
	static void change() {
		college ="TesTDisplay";
	}
	
	void display() {
		System.out.println(rollno+"  "+name+"  "+college);
	}
	
}


public class StaticVariableAndMethod {
	public static void main(String[] args) {
		StudentSVM s1 = new StudentSVM(111,"Test1");
		StudentSVM s2 = new StudentSVM(22,"Test2");
		StudentSVM s3 = new StudentSVM(333,"Test3");
		
		
		s1.display();
		StudentSVM.college = "TEST";
		s2.display();
		StudentSVM.change();
		s3.display();
		
	}
	
}
