package com.oops.override1;

public class Customer {

	public static void main(String[] args) {
		Project project = new Project("Corporate", "6 Months", "Raja");
		project.projectsAssigned();

		GroupOne groupOne = new GroupOne("Tech Corp", "3 Months", "Priya");
		String[] tools = groupOne.showTools();
		System.out.println("Group One Tools:");
		for (String tool : tools) {
			System.out.println(tool);
		}

		GroupTwo groupTwo = new GroupTwo("Edu Soft", "4 Months", "Kumar");
		groupTwo.coursesAssigned("AI", "Machine Learning", "Cloud Computing");
	}
	
}
