package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=0;
		Bank bank = new Bank(500);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want Withdraw or Deposit");
		String option = sc.next();
		
		switch(option) {
			case "Withdraw":
				System.out.println("Please Enter the withdraw Amount.");
				double withdraw = sc.nextDouble();
				bank.withdraw(withdraw);
				balance = bank.getBalance();
				System.out.println("Balance Amount is "+balance);
				break;
			case "Deposit":
				System.out.println("Please Enter the withdraw Amount.");
				double deposit = sc.nextDouble();
				bank.deposit(deposit);
				balance = bank.getBalance();
				System.out.println("Balance Amount is "+balance);
				break;
			default:
				System.out.println("please Enter the correct option for the transaction.");
		}
		sc.close();
	}

}
