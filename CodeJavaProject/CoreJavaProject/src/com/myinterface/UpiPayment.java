package com.myinterface;

public class UpiPayment implements Payment {

    @Override
    public void pay(double ammount) {
        System.out.println("You have made a payment via UPI : " + ammount);
    }
}