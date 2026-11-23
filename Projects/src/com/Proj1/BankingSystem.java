package com.Proj1;

import java.util.ArrayList;

public class BankingSystem {

	private ArrayList<Customer> customers;
	private ArrayList<Account> accounts;
	private ArrayList<Transaction> transactions;
	
	private int nextTransactionId = 1;
	
	public BankingSystem() {
		customers = new ArrayList<>();
		accounts = new ArrayList<>();
		transactions = new ArrayList<>();
	}
	
	//add customer info into data base
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	//Look for customers id in Customer database. 
	public Customer findCustomerById(int customerId) {
		for(Customer customer : customers) {
			if(customer.getCustomerId() == customerId) {
				return customer;
			}
		}
		return null;
	}
	

	
	//Look for customers accounts' by their account number in Customer database.
	public Account findAccountByNumber(String accountNumber) {
	    for (Account account : accounts) {
	        if (account.getAccountNumber().equals(accountNumber)) {
	            return account;
	        }
	    }

	    return null;
	}
	
	public boolean depositToAccount(String accountNumber, double amount) {
	    Account account = findAccountByNumber(accountNumber);

	    if (account == null) {
	        return false;
	    }

	    if (!account.deposit(amount)) {
	        return false;
	    }

	    Transaction transaction =
	            new Transaction(nextTransactionId, "Deposit", amount, account);

	    addTransaction(transaction);
	    nextTransactionId++;

	    return true;
	}
	
	
	public boolean withdrawFromAccount(String accountNumber, double amount) {
		Account account = findAccountByNumber(accountNumber);
		
		if (account == null) {
	        return false;
	    }

	    if (!account.withdraw(amount)) {
	        return false;
	    }
	    
	    Transaction transaction =
	    		new Transaction(nextTransactionId, "Withdraw", amount, account);
	    
	    addTransaction(transaction);
	    nextTransactionId++;
	    
		return true;
	}
}
