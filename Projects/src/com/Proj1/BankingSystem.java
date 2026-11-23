package com.Proj1;

import java.util.ArrayList;

public class BankingSystem {

	private ArrayList<Customer> customers;
	private ArrayList<Account> accounts;
	private ArrayList<Transaction> transactions;
	
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
	
	
	//Look for customers account number in Customer database. 

	public Account findCustomerByAccount(int accountNumber) {
		for(Account account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}
	
}
