package com.shristi.abstraction;

public abstract class Branch2 extends Bank {

	@Override
	void housingLoan() {
		System.out.println("Housing Loan in branch2");
	}

	@Override
	void eduLoan() {
		System.out.println("Eduction loan in branch2");
	}
	
	//own method
	void loanTypes() {
		System.out.println("for agriculture, small busiiness, shops");
	}
}
