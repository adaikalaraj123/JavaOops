package com.iopackage.csv;

public class Employee {
	private String name;
    private int empId;
    private String city;
    
	public Employee(String name, int empId, String city) {
		super();
		this.name = name;
		this.empId = empId;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getCity() {
		return city;
	}

	
	@Override
    public String toString() {
        return "Employee [Name=" + name + ", EmpID=" + empId + ", City=" + city + "]";
    }
    
	
}
