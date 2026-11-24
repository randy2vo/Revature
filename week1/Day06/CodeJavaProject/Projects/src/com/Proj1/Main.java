package com.Proj1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "randy", "555-5552");
		
		CheckingAccount checking = new CheckingAccount("10001", 500.00, customer, 100.00);
		
		SavingsAccount savings = new SavingsAccount("20001", 200.200, customer, 0.03);
		
		BankingSystem bank = new BankingSystem();
		bank.addCustomer(customer);
		bank.addAccount(checking);
		bank.addAccount(savings);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("Choose an option: ");
		String choice = scanner.nextLine();
		
		System.out.println("Enter the account number");
		String accountNumber = scanner.nextLine();
		
		try {
			double amount = Double.parseDouble(scanner.nextLine());
			boolean successful;
			
			if(choice.equals("1")) {
				successful =bank.depositToAccount(accountNumber, amount);
			} else if (choice.equals("2")) {
				successful = bank.depositToAccount(accountNumber, amount);
			} else {
				System.out.println("Please choose 1 or 2.");
				return;
			}
			
			System.out.println("Operation successful: " + successful);
			
			Account account = bank.findAccountByNumber(accountNumber);
			if (account != null) {
				System.out.println("Current balance: " + account.getBalance());
			}
		} catch(NumberFormatException e) {
			System.out.println("Invalid amount, Enter a number, such as 25.50");
			
		}
	
		
	}

}
