package com.day17.AbstractClassClasswork;

public abstract class SampleAC implements Laptop{
	// Non access modifier -- abstract class


		public void copy() {
			System.out.println("Lenovo copy code");
		}


		public void paste() {
			System.out.println("Lenovo paste code");
		}
		
		public abstract void cut();
		
		public abstract void keyboard();

}
