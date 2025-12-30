package com.day13.ConstructorMethodKeyWdStaticThis;

public class StaticBlock {
	static {
		System.out.println("This is created at the time of class load itself");
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
