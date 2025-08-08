package com.oops.override1;

public class GroupTwo extends Project {
	public GroupTwo(String clientName, String duration, String TLName){
		super(clientName, duration, TLName);
	}
	
	void coursesAssigned(String... courses) {
		System.out.println("Courses Assigned:");
		for (String course : courses) {
			System.out.println(course);
		}
	}
}
