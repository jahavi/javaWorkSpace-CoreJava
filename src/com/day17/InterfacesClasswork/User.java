package com.day17.InterfacesClasswork;

public class User {
	
	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.camera();
		
		HP hp =new HP();
		hp.copy();
		
		//This is done only till java 7/1.7
		//Java 8/1.8 is one of the most advanced feature are implemented
		
		// Then they introduced implementation can be done in this interface itself 
//		to overcome so many other issue -- like example here if you wnated to introduce any new buissiness rule into the 
//		document then all the classes that are implemeting that interface will be effect -- to over come this
//		 you can now direclly implement in the interface itself 
//		for doing this implementation here you have two keyword -- default and static 
		
		lenovo.security();
		
		// static keyword		
		Laptop.audio();
		
		//Java9
//		PRIVATE acess specifier in the interfaces is created in the java9
//		By using this private it will allow only the in this interface no ware outside this 
//		The main need to do this is  codereusability inside the interfaces
//		I mean if there are some code common in this default on method and static method for example
//		to provide the code reusability they introduced this here
		
		
		 
	}

}


// Interface is a buissiness document
// We have set of method inside the interface
// In that method how to do will not be there only what to do will be there -- abstract methods 
//method name and method is defined no implemention is done here 
//for that bussiness document interface implementation is done using class 
// default override keyword is not mandatory over there
