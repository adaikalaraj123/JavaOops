package com.bankapp.client;

import java.util.Scanner;

import com.bankapp.service.Account;
import com.bankapp.service.Current;
import com.bankapp.service.Savings;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;
		while (true) {
            System.out.println("\n===== Welcome to Virtual ATM =====");
            System.out.println("1. Open Savings Account");
            System.out.println("2. Open Current Account");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account = new Savings(10000); // initial balance
                    System.out.println("Savings Account created with balance: " + account.getBalance());
                    ((Savings) account).showDepositSchemes();
                    break;

                case 2:
                    account = new Current(15000); // initial balance
                    System.out.println("Current Account created with balance: " + account.getBalance());
                    ((Current) account).transactionsAllowed();
                    break;

                case 3:
                    System.out.println("Thank you for using Virtual ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }
		
			// Banking operations loop
	        while (true) {
	            System.out.println("\n--- ATM Menu ---");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit to Main Menu");
	            System.out.print("Enter choice: ");
	            int op = sc.nextInt();
	
	            switch (op) {
	                case 1:
	                    System.out.print("Enter withdraw amount: ");
	                    double w = sc.nextDouble();
	                    account.withdraw(w);
	                    break;
	                case 2:
	                    System.out.print("Enter deposit amount: ");
	                    double d = sc.nextDouble();
	                    account.deposit(d);
	                    break;
	                case 3:
	                    System.out.println("Current Balance: " + account.getBalance());
	                    break;
	                case 4:
	                    System.out.println("Returning to Main Menu...");
	                    break;
	                default:
	                    System.out.println("Invalid option.");
	            }
	
	            if (op == 4) break;
	
	            System.out.println("Do you want to perform another transaction? (yes/no): ");
	            String cont = sc.next();
	            if (!cont.equalsIgnoreCase("yes")) {
	                System.out.println("Thank you for using Virtual ATM!");
	                System.exit(0);
	            }
	        }
		}
	}
}
