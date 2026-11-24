package com.myException;

public class UseException {
	
	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 3, 4};
		
		try {
			System.out.println(myArray[2]);
			System.out.println("I'm in tryblock"); //This will not show the message after the exception
			
			int x = 10/0; // divide by 0 exception
			
			String name = "Max";
			System.exit(1);
			name = null;
			
			System.out.println(name.length());
//		}
//		catch(Exception e) {
//			System.out.println("Something went wrong!");
			
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e ) { //combine all exception
			System.out.println("Invalid input\n" + e.getMessage());
		
		}finally {
			System.out.println("I'm going to execute anyways");
		}
		System.out.println("Message completed"); 
		
	}
}
