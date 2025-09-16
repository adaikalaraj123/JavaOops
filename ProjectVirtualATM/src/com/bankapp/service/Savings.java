package com.bankapp.service;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	public
	void withdraw(double withdrawamount) {
		if(withdrawamount>balance) {
			System.out.println("Insufficient balance in Savings Account.");
		}else {
			balance-=withdrawamount;
			System.out.println("Withdrawn "+withdrawamount+" from Savings Account.");
		}
	}

	@Override
	public
	void deposit(double depositeamount) {
		balance+=depositeamount + (depositeamount * 0.02);
		System.out.println(" Deposited " + depositeamount + " (+2% bonus) into Savings Account.");
	}
	
    public void showDepositSchemes() {
        System.out.println("Savings Deposit Schemes:");
        System.out.println("- Fixed Deposit");
        System.out.println("- Recurring Deposit");
        System.out.println("- Tax Saver Deposit");
    }
	
}
