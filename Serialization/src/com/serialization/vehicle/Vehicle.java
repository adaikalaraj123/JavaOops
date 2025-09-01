package com.serialization.vehicle;

import java.io.Serializable;

public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String model;
    private String brand;
    private double price;
    
	public Vehicle(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "Vehicle [Model=" + model + ", Brand=" + brand + ", Price=" + price + "]";
    }
 
}
