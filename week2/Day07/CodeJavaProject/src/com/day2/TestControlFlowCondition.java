package com.day2;

public class TestControlFlowCondition {

	//Learning if Statements
	public static void main(String[] args) {
		
		int marks = 82;
		int age = 21;
		int day = 3;
		
		if(marks > 60) {
			System.out.println("Pass");
		}
		
		if (age > 18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("Ineligible for voting");
		}
		
		if(marks >= 90) 
			System.out.println("A");
		else if(marks >= 75) 
				System.out.println("B");
		else if(marks >= 60) 
			System.out.println("C");
		else 
			System.out.println("Fail");
		
			
		if(age >= 18) {
			System.out.println("Eligible for voting");
			System.out.println("Hello");
		} else 
			System.out.println("Ineligile for voting");
		
		if(age >= 18 && marks >= 75) {
			System.out.println("adults and scored good marks");	
		} else {
			System.out.println("Adult or CHild didnt score good marks");
		}
		
		if(age > 18) {
			if(marks >= 75) 
				System.out.println("Adult and scored good marks");
			 else 
				System.out.println("adult and failed");
		} else {	
		
		}
		
		String dayName = null;
		
		switch(day) {
		
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
			
		case 6:
				
			dayName = "Saturday";
			break;
				
				
		}
		
	}

}
