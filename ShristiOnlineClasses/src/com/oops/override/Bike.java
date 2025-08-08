package com.oops.override;

public class Bike extends Vehicle {
	public Bike(String name, String model) {
		super(name, model);
		// TODO Auto-generated constructor stub
	}
	@Override
//	void getMilage() {
//		// TODO Auto-generated method stub
//		super.getMilage();
//	}
	void getMilage(){
		System.out.println("This is Bike");
	}
	
	void printType() {
		System.out.println("Sports Bike");
	}
}
