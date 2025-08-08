package com.oops.override;

public class Vehicle {
	String Name;
	String Model;
	public Vehicle(String name, String model) {
		super();
		Name = name;
		Model = model;
	}
	void getMilage(){
		System.out.println("This is Vehicle");
	}
	
}
