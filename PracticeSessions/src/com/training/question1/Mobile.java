package com.training.question1;


public class Mobile {
	String model;
	double price;
	String brand;

	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	void getDetails() {
		System.out.println(model+" "+price+" "+brand);
	}
	
	String[] showFeatures(){
		String arr[]= {"Good Camera", "Android OS", "500Mh charger"};
		
//		for(String ar: arr)
			
		return arr;
	}

}
