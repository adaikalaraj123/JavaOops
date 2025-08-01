package com.over.quest4;

public class Greeter {
	String name; 
	 // default const, parameterized const 
	public Greeter() {
		super();
	}
	public Greeter(String name) {
		super();
		this.name = name;
	}

	void greetUser(String... messages){ 
	     // iterate through messages and print message + name; 
	     // here the message varies but name is same 
		System.out.println("Greet User.....");
		for(String message : messages) {
			System.out.println("Message:"+message + name);
		}
	} 
	
	void sayHello(String... names){ 
		// iterate through names and print "Welcome"+name; 
     	// here the message is same but name varies 
		System.out.println("Say Hello.....");
		for(String name : names) {
			System.out.println("Welcome "+name);
		}
	}
}
