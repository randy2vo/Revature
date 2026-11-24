package com.myinterface;

public class CreditCardPayment implements Payment{
	
	public void pay(double ammount) {
	System.out.println("You have made the payment via credit card of ammount: " + ammount);	
	}

}
