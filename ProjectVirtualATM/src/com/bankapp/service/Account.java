package com.bankapp.service;

public abstract class Account {
	protected double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public double getBalance() {
        return balance;
    }
}
