package com.day1;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("Enter a number greater than 10 to reverse: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int reversed = 0;
		while (num > 0) {
			reversed = reversed * 10 + (num % 10);
			num /= 10;
		}

		System.out.println("Reversed number: " + reversed);
		sc.close();

		
	}

}