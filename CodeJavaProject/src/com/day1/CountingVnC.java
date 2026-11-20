package com.day1;
import java.util.Scanner;

public class CountingVnC {

	public static void main(String[] args) {
		
		System.out.println("Counting Vowels and Consonants in a String");
		System.out.println("Enter a String");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
		sc.close();

	}

}