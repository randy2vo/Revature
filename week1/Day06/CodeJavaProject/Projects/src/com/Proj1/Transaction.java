package com.Proj1;

public class Transaction {
	
	private int transactionId;
	private String transactionType;
	private double amount;
	private Account account;
	
	
	public Transaction(int transactionId, String transactionType, double amount, Account account) {
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.account = account;
		
	}


	public String getTransactionType() {
		return transactionType;
	}


	public double getAmount() {
		return amount;
	}


	public int getTransactionId() {
		return transactionId;
	}


	public Account getAccount() {
		return account;
	}
		
	
}
