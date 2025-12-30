package com.day17.InterfacesClasswork;

public interface Laptop {
	
	public void copy(); // In this method no {} only what to do not how to do // So this is called abstract methods
	public void paste(); // In this method no {} only what to do not how to do // So this is called abstract methods
	public void cut(); // In this method no {} only what to do not how to do // So this is called abstract methods
	public void keyboard();
	// Class is a implementer for the interface
	
	//This is done only till java 7 
			//Java 8 is one of the most advanced feature are implemented
			
			// Then they introduced implementation can be done in this interface itself 
//			to overcome so many other issue -- like example here if you wnated to introduce any new buissiness rule into the 
//			document then all the classes that are implemeting that interface will be effect -- to over come this
//			 you can now direclly implement in the interface itself 
//			for doing this implementation here you have two keyword -- default and static 
	
	default void security() {
		commonCode();
		System.out.println("Sercurity... ");
	}
	
	static void audio() {
		commonCode(); //Here this is static and the private need to be static to call inside the static method
		System.out.println("Sercurity... ");
	}
	
	//Java9
//	PRIVATE acess specifier in the interfaces is created in the java9
//	By using this private it will allow only the in this interface no ware outside this 
//	The main need to do this is  codereusability inside the interfaces
//	I mean if there are some code common in this default on method and static method for example
//	to provide the code reusability they introduced this here
	
	private static void commonCode() {
		System.out.println("Common Code");
	}
	
	
}
