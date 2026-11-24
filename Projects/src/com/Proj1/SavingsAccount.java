package com.Proj1;

public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount(String accountNumber, double balance, Customer customer, double interestRate) {
		super(accountNumber, "Savings", balance, customer);
		this.interestRate = interestRate;
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double calculateInterest() {
		if(getBalance() <= 100.00) {
			return 0.0;
		}
		
		return getBalance() * interestRate;
	}
	
	
	
}
