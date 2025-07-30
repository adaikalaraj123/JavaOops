package com.training.question3;

public class Product {
	 void itemsAvailable(String... itemNames){
		 System.out.println("itemNames are:");
		 for(String itemName:itemNames)
			 System.out.println(itemName);
	 }
	 void showReviews(String itemName, String...reviews){
	      // print the itemname and the reviews
		 System.out.println("itemName:"+itemName);
		 System.out.println("Reviews for " + itemName + ":");
		 for (String review : reviews) {
		     System.out.println("- " + review);
		 }
	 }

}
