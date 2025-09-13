package com.set.compare;

public class Employee implements Comparable<Employee>{

	private String empName;
	private String city;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, String city, double salary) {
		super();
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", city=" + city + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee o) {
		//return this.getCity().compareTo(o.city);
		Double sal = this.getSalary(); //autoboxing
		//return sal.compareTo(o.getSalary()); //reverse sorting descending
		//return Double.compare(o.getSalary(), o.getSalary());
		int val = this.getCity().compareTo(o.getCity());
		if(val==0)
			return this.getEmpName().compareTo(o.getEmpName());
		return val;
	}
}

//
//
//
//import java.util.*;
//
//public class MapStateDemo {
//
//    private Map<String, List<String>> states;
//
//    public MapStateDemo() {
//        states = new HashMap<>();
//
//        // Add states with 4 cities
//        states.put("Tamil Nadu", Arrays.asList("Chennai", "Coimbatore", "Madurai", "Trichy"));
//        states.put("Karnataka", Arrays.asList("Bengaluru", "Mysuru", "Mangalore", "Hubli"));
//        states.put("Maharashtra", Arrays.asList("Mumbai", "Pune", "Nagpur", "Nashik"));
//        states.put("Kerala", Arrays.asList("Thiruvananthapuram", "Kochi", "Kozhikode", "Thrissur"));
//    }
//
//    // List all states and their cities
//    public void listStates() {
//        for (Map.Entry<String, List<String>> entry : states.entrySet()) {
//            System.out.println("State: " + entry.getKey());
//            System.out.println("Cities: " + entry.getValue());
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        MapStateDemo demo = new MapStateDemo();
//        demo.listStates();
//    }
//}
