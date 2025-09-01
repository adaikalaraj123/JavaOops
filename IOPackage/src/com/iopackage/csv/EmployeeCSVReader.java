package com.iopackage.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCSVReader {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        String filePath = "employees.csv"; // make sure this path is correct

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // split by comma
                if (data.length == 3) {
                    String name = data[0].trim();
                    int empId = Integer.parseInt(data[1].trim());
                    String city = data[2].trim();
                    employees.add(new Employee(name, empId, city));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Filter and print employees belonging to a particular city
        String cityToSearch = "Bangalore";
        System.out.println("Employees in " + cityToSearch + ":");
        for (Employee emp : employees) {
            if (emp.getCity().equalsIgnoreCase(cityToSearch)) {
                System.out.println(emp);
            }
        }
	}
}
