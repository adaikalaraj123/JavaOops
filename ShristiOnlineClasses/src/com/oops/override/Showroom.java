package com.oops.override;

import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter C for car & b for bike");
		String choice = sc.next();
		Vehicle vehicle = null;
		if(choice.toUpperCase().equals("C"))
			vehicle = new Car();
		else
			vehicle = new Bike();
		vehicle.getMilage();
		*/
		Vehicle vehicle = new Car("Honda","City");
		vehicle.getMilage();
//		Car car = new Car("Honda","butty");
//		Car car = (Car)vehicle;
//		car.showAcc();
		
		vehicle = new Bike("Honda","A123");
		vehicle.getMilage();
		
		Car car = (Car)vehicle;
		car.showAcc();
		
		Bike bike = (Bike)vehicle;
		bike.printType();
	}

}
