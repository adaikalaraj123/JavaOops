package com.shristi.abstraction;

public abstract class Bank {
	abstract void carLoan();
	abstract void housingLoan();
	abstract void eduLoan();
	final void adminDetails() {
		System.out.println("Rules for bank employees");
	}
}
