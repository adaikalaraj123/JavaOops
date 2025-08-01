package com.over.quest4;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter obj = new Greeter("Sara"); 
		obj.greetUser("welcome","Great day");  
		obj.greetUser("Good Day","Have Tea","Enjoy Learning"); 
		 
		Greeter obj1 = new Greeter(); 
		obj1 .sayHello("Sri","Priya"); 
		obj1.sayHello("Sara","Anna","Reena","Rohan"); 
		obj1.sayHello("Jo","Roni"); 
	}

}
