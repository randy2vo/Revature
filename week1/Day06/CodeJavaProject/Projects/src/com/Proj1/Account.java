package com.Proj1;

public class Account {
	private String accountNumber;
	private String accountType;
	private double balance;
	private Customer customer;
	
	public Account(String accountNumber, String accountType, double balance, Customer customer) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.customer = customer;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	
	//checks if the deposit succeed or not. if not than the amount is at 0 or negative. 
	public boolean deposit(double amount) {
		if(amount <= 0) {
			return false;
		}
		
		balance += amount;
		return true;
	}
	
	//CHecks if the withdraw is less than amount drawn or it will return false
	public boolean withdraw(double amount) {
		if (amount <= 0 || amount > balance) {
			return false;
		}
		
		balance -= amount;
		return true;
	}
	
	
}
