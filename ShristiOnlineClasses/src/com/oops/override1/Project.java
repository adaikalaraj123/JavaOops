package com.oops.override1;

public class Project {
	String clientName;
	String duration;
	String TLName;
	public Project(String clientName, String duration, String TLName) {
		super();
		this.clientName = clientName;
		this.duration = duration;
		this.TLName = TLName;
	}
	void projectsAssigned() {
		System.out.println("AI Projects");
	}
}
