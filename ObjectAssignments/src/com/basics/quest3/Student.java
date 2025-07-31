package com.basics.quest3;

import java.util.Arrays;

public class Student {
	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails() {
		System.out.println("Student Name:"+name+", Department:"+department);
	}
	String getGrades(int[] marks) {
		System.out.println("Student Marks"+Arrays.toString(marks));
		int sum=0;
		
		for(int mark:marks) {
			sum+=mark;
		}
		double avg=(double)sum/marks.length;
		
		String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else if (avg >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }
        System.out.println("Total Marks      : " + sum);
        System.out.println("Average Marks    : " + avg);
        return grade;
	}
}
