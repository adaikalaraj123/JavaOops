package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		Training training = new Training();
		System.out.print("Enter number of trainers: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] trainerNames = new String[n];
	    for (int i = 0; i < n; i++) {
	        System.out.print("Enter name of trainer " + (i + 1) + ": ");
		    trainerNames[i] = scanner.nextLine();
		}
	    training.showTrainers(trainerNames);
	    
	    System.out.println("\nAvailable Courses:");
        String[] courses = training.showCourses();
        for (String course : courses) {
            System.out.println("- " + course);
        }
        scanner.close();
	}

}
