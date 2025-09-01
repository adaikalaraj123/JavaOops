package com.shristi.abstraction;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		System.out.println("Car loan in sub branch");
	}
	//own method
	void depositTypes() {
		System.out.println("SIP, recurring, short term");
	}
	
}
