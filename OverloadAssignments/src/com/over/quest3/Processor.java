package com.over.quest3;

public class Processor {
	 void calculate(double x){ // print the squareroot 
		 System.out.println("Square root of " + x + " is: " + Math.sqrt(x));
	 }
	 void calculate(int x, int y){ // print the product 
		 System.out.println("Product of " + x + " and " + y + " is: " + (x * y));
	 }
	 void calculate(double x, double y){ // print the difference
		 System.out.println("Difference between " + x + " and " + y + " is: " + (x - y));
	 }
	 void calculate(double x,int y) { // print x power y 
		 System.out.println(x + " raised to the power of " + y + " is: " + Math.pow(x, y));
	 }
	 void calculate(int x) { // print the square  
		 System.out.println("Square of " + x + " is: " + (x * x));
	 }
}
