package com.over.quest1;

public class Employee {
	String name;
	String designation;
	
	Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	void calcBonus(double basicAllowance){// add simple print stmts
	 System.out.println("basicAllowance:"+basicAllowance);
	}
	
	void calcBonus(double basicAllowance, String gift){// add simple print stmts
		System.out.println("basicAllowance:"+basicAllowance+", Gift:"+gift);
	} 
	
	void calcBonus(double basicAllowance, String gift , double houseAllowance){// add simple print stmts
		System.out.println("basicAllowance:"+basicAllowance+", Gift:"+gift+", houseAllowance:"+houseAllowance);
	}
}
