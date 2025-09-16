package com.bankapp.service;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double withdrawamount) {
		if(withdrawamount > balance + 5000) {
			System.out.println("Withdrawal exceeds overdraft limit in Current Account.");
		} else {
            balance -= withdrawamount;
            System.out.println("Withdrawn " + withdrawamount + " from Current Account.");
        }

	}

	@Override
	public void deposit(double depositeamount) {
		balance += depositeamount;
		System.out.println("Deposited " + depositeamount + " into Current Account.");
	}

	public void transactionsAllowed() {
        System.out.println("Current Account allows 20 free transactions per day.");
    }
}
