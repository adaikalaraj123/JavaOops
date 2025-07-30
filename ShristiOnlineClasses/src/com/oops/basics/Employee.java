package com.oops.basics;

public class Employee {
	String employeeName;
	int employeeId;
	double salary;
	
	void getDetails() {
		System.out.println(employeeName+" "+employeeId+" "+salary);
	}
	
	String greet(String message) {
		return message+" "+ employeeName;
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.employeeName="Priya";
		employee1.employeeId=10;
		employee1.salary=6000;
		
		Employee employee2 = new Employee();
		employee2.employeeName="Sahayam";
		employee2.employeeId=11;
		employee2.salary=7000;
		
		Employee employee3 = null;
		
		System.out.println(employee1.employeeId +" "+employee1.employeeName+" "+employee1.salary);
		System.out.println(employee2.employeeId +" "+employee2.employeeName+" "+employee2.salary);
		
		System.out.println(employee3.employeeId );
	}
	*/
}
