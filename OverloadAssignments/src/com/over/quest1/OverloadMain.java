package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];
		for(int i=0;i<employees.length;i++) {
			System.out.println("Please Details of Employee "+(i+1));
			
			System.out.println("Enter the Employee Name:");
			String empname = sc.nextLine();
			
			System.out.println("Please Enter the Designation (Programmer / Manager / Director):");
			String designation = sc.nextLine();
			
			employees[i] = new Employee(empname, designation);

            if (designation.equalsIgnoreCase("Programmer")) {
                employees[i].calcBonus(5000.0);
            } else if (designation.equalsIgnoreCase("Manager")) {
                employees[i].calcBonus(8000.0, "Laptop");
            } else if (designation.equalsIgnoreCase("Director")) {
                employees[i].calcBonus(10000.0, "Car", 5000.0);
            } else {
                System.out.println("Invalid designation entered.");
            }
            System.out.println("----------------------------------------------------");
		}
		sc.close();
		
	}

}
