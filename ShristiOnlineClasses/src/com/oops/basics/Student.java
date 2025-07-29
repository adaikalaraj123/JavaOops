package com.oops.basics;

public class Student {

	String studentName;
	String department; 
	Student(String name, String department) {
		studentName = name;
		this.department = department;
	}
	void getdeatils(){
		System.out.println("Name: "+studentName);
		System.out.println("department: "+department);
	}
	public static void main(String[] args) {
		Student obj1 = new Student("Raja","Science");
		obj1.getdeatils();
		Student obj2 = new Student("Roja","Comp. Science");
		obj2.getdeatils();
	}

}
