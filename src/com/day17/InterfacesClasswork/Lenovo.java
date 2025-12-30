package com.day17.InterfacesClasswork;

public class Lenovo implements Laptop{

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo paste code");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo cut code");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo keyboard code");
	}
	
	public void camera() {
		System.out.println("Lenovo camera code");
	}
	@Override
	public void security() {
		System.out.println("implement security");
	}
}
