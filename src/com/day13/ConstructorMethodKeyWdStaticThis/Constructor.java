// Constructor
// This is a block of code similar to method 
// It is called when the instance of the class is created 
// time of calling constructor memory for the obj is allocated
// in the memory

// Constructor cannot be abstract, static final or synchronized

//1 default cosntructor 2 parameterized constructor

package com.day13.ConstructorMethodKeyWdStaticThis;

public class Constructor {
	
	Constructor(){
		System.out.println("This is default constructor");
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
	}
}
