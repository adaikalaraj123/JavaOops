package com.basics.quest4;

public class Training {
	String[] showCourses() {
		String[] courses = { "Java", "Python", "Angular", "React", "SQL" };
		return courses;
	}
	void showTrainers(String... names) {
		 System.out.println("Trainer Names:");
	    for (String name : names) {
	        System.out.println("- " + name);
	    }
	}
}