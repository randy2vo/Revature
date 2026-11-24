package com.myinterface;

public class UsePayment {

	public static void main(String[] args) {
		
		CreditCardPayment ccp = new CreditCardPayment();
		ccp.pay(200);
		
		Payment p1 = new CreditCardPayment();
		p1.pay(5);
		
		Payment p2 = new UpiPayment();
		p2.pay(77);

		
		
	}

}
