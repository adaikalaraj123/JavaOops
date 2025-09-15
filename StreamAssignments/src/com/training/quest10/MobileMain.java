package com.training.quest10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MobileMain {

	public static void main(String[] args) {
		 // a. Add 5 mobile objects to a list using asList() method
		List<Mobile> mobiles = Arrays.asList(
				new Mobile(10, "Samsung", "Galaxy S21", 55000),
				new Mobile(11, "Apple", "iPhone 14", 75000),
				new Mobile(12, "OnePlus", "Nord CE", 19999),
				new Mobile(13, "Samsung", "Galaxy A52", 18000),
				new Mobile(14, "Apple", "iPhone SE", 42000)
        );
		
		System.out.println("All Mobiles:");
        mobiles.forEach(System.out::println);

        // b. Get the list of mobiles by a brand (Samsung)
        System.out.println("\n Samsung Mobiles:");
        mobiles.stream()
                .filter(m -> m.getBrand().equalsIgnoreCase("Samsung"))
                .forEach(System.out::println);

        // c. Get one list of mobiles by brand, sort by model and print
        System.out.println("\n Apple Mobiles Sorted by Model:");
        mobiles.stream()
                .filter(m -> m.getBrand().equalsIgnoreCase("Apple"))
                .sorted(Comparator.comparing(Mobile::getModel))
                .forEach(System.out::println);

        // d. Get one mobile by id 10, if not found throw runtime exception
        System.out.println("\n Mobile with ID 10:");
        Mobile mobileById = mobiles.stream()
                .filter(m -> m.getMobileId() == 10)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Mobile with ID 10 not found!"));
        System.out.println(mobileById);

        // e. Get list of mobiles by brand and price less than 20000
        System.out.println("\n OnePlus Mobiles < 20000 :");
        mobiles.stream()
                .filter(m -> m.getBrand().equalsIgnoreCase("OnePlus") && m.getPrice() < 20000)
                .forEach(System.out::println);

        // f. Get the list of mobiles by brand, sort by model and print only the mobile names
        System.out.println("\n Samsung Mobile Models (Sorted) :");		
        mobiles.stream()
                .filter(m -> m.getBrand().equalsIgnoreCase("Samsung"))
                .sorted(Comparator.comparing(Mobile::getModel))
                .map(Mobile::getModel)
                .forEach(System.out::println);
	}

}
