package com.training.question1;

import java.util.Arrays;

public class MobMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj1 = new Mobile("A1",22000,"No1");
		obj1.getDetails();
		String[] fe= obj1.showFeatures();
		System.out.println(Arrays.toString(fe));

		Mobile obj2 = new Mobile("A2",12000,"No2");
		obj1.getDetails();
		String[] fe1= obj2.showFeatures();
		System.out.println(Arrays.toString(fe1));
	}
}
