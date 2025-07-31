package com.basics.quest5;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile1 = new Mobile("Galaxy A14", "Samsung", "Red");
		Mobile mobile2 = new Mobile("iPhone 14", "Apple", "Yellow");
		Mobile mobile3 = new Mobile("Redmi Note 12", "Xiaomi", "Orange");
		Mobile mobile4 = new Mobile("Galaxy S22", "Samsung", "Blue");
		Mobile mobile5 = new Mobile("Pixel 6a", "Google", "Ash");
		
		Mobile[] mobileArray = new Mobile[5];
		mobileArray[0]=mobile1;
		mobileArray[1]=mobile2;
		mobileArray[2]=mobile3;
		mobileArray[3]=mobile4;
		mobileArray[4]=mobile5;
		
		System.out.println("=== All Mobile Details ===");
        for (Mobile mobile : mobileArray) {
            mobile.getDetails();
        }
        System.out.println("=== Samsung Mobiles ===");
        for (Mobile mobile : mobileArray) {
            if (mobile.getBrand().equalsIgnoreCase("Samsung")) {
                mobile.getDetails();
            }
        }
	}
}
