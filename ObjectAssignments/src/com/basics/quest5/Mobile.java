package com.basics.quest5;

public class Mobile {
	String model;
	String brand;
	String color;
	public Mobile(String model, String brand, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
	} 
	void getDetails() {
		System.out.println("Model:"+model+" ,Brand:"+brand+" ,Color:"+color);
	}
	public String getBrand() {
	   return brand;
	}
}
