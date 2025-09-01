package com.shristi.abstraction;

public class Client {
	public static void main(String[] args) {
		Bank bank = new Branch1();
		// using bank ref call all methods of bank class
		bank.carLoan();
		bank.housingLoan();
		bank.eduLoan();
		bank.adminDetails();
		
		// call own method of branch1
		Branch1 branch1 = (Branch1)bank;
		branch1.payDetails();
		
		//for subbranch bank ref = new SubBranch();
		// super classref = sub class object
		//Cannot call subclass method
		Branch2 branch2 = (Branch2)bank;
		branch2.loanTypes(); // branch2
		branch2.adminDetails(); //bank
		
		// call own method of subbranch
		// super classref = sub class object
		SubBranch sub = (SubBranch)branch2;
		sub.depositTypes();//subbranch
		sub.loanTypes();//branch2
		sub.adminDetails();//bank
	}
}
