package com.Proj1;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, String accountType, double balance, Customer customer, double overdraftingLimit) {
		super(accountNumber, accountType, balance, customer);
		this.overdraftLimit = overdraftingLimit;	
		
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
}
