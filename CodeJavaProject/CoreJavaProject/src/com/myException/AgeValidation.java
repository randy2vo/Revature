package com.myException;

public class AgeValidation {
	public static void main(String[] args) {
		
		try {
			checkAge(15);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		
		}
	}
	
	public static void checkAge(int age) throws IllegalArgumentException {
		if(age < 16) {
			throw new IllegalArgumentException("under age person cannot be processed");
		} else {
			System.out.println("Valid age");
		}
	}
}
