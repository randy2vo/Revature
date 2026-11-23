package com.Proj1;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "randy", "555-5552");
		
		Account account = new Account("10001", "Checking", 1000.00, customer);
		
		BankingSystem bank = new BankingSystem();
		bank.addCustomer(customer);
		bank.addAccount(account);
		
		boolean depositWorked = bank.depositToAccount("10001", 1000.00);
		System.out.println("Deposit worked: " + depositWorked);
		System.out.println("Balance: " + account.getBalance());
		
		boolean withdrawalWorked = bank.withdrawFromAccount("10001", 25.00);
        System.out.println("Withdrawal worked: " + withdrawalWorked);
        System.out.println("Balance: " + account.getBalance());

	}

}
