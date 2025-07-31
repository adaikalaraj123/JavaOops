package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Student ID: 1");
		
		System.out.println("please Enter the Student Name:");
		String name1=sc.next();
		System.out.println("please Enter the Student Department:");
		String department1=sc.next();
		System.out.println("Student ID: 2");
		
		System.out.println("please Enter the Student Name:");
		String name2=sc.next();
		System.out.println("please Enter the Student Department:");
		String department2=sc.next();
		
		Student stud1 = new Student(name1, department1);
		stud1.printDetails();
		int[] marks1 = {80,97,76,89,77};
		stud1.getGrades(marks1);
		
		
		Student stud2 = new Student(name2, department2);
		stud2.printDetails();
		int[] marks2 = {77,56,90,99,85};
		stud2.getGrades(marks2);
		
		sc.close();
	}

}
