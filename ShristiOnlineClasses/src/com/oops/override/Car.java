package com.oops.override;

public class Car extends Vehicle {

	public Car(String name, String model) {
		super(name, model);
		// TODO Auto-generated constructor stub
	}
	@Override
//	void getMilage() {
//		// TODO Auto-generated method stub
//		super.getMilage();
//	}
	void getMilage(){
		System.out.println("This is Car");
	}
	void showAcc() {
		System.out.println("Seat Cover, Car Cover");
	}
}
