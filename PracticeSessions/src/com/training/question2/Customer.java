package com.training.question2;

public class Customer {

	public static void main(String[] args) {
		PaymentOptions obj1=new PaymentOptions();
		obj1.pay(20000);
		obj1.pay(123412, 332, 2000);
		obj1.pay("arj@1234", 32000.00);
		obj1.pay("State Bank","Adaikalam", 52000);
	}

}
