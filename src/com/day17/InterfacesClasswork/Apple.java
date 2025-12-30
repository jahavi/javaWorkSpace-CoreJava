package com.day17.InterfacesClasswork;

public class Apple implements Laptop {
	@Override
	public void copy() {
		System.out.println("Apple copy code");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("Apple paste code");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Apple cut code");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Apple keyboard code");
	}
}
