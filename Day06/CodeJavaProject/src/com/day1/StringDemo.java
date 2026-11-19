package com.day1;

public class StringDemo {

	public static void main(String[] args) {
		// String literals are stored in the string pool.
		String s1 = "Hello";
		String s2 = "Java"; // kept to show another pooled literal
		
		// new String(...) creates a separate object in heap memory.
		String s3 = new String("Hello");
		String s4 = "Hello";
		
		// == compares references (memory location), not text content.
		System.out.println(s1 == s4);
		System.out.println(s1 == s3);
		
		// equals(...) compares actual text content.
		System.out.println(s1.equals(s3));
		
		String name = "Alice";
		
		// concat creates a new String; original string remains unchanged.
		String newname = name.concat("Max");
		System.out.println("Alice became: " + newname);
		System.out.println(name);
		
		// length returns the number of characters in the string.
		int nameLen = name.length();
		System.out.println("Length of name (Alice): " + nameLen);
		
		// indexOf returns the position of the first matching character.
		int nameInd = name.indexOf('l');
		System.out.println("Position of 'l' from Alice:" + nameInd);
		
		// indexOf can also search for a substring.
		System.out.println("index of Max: " + newname.indexOf("Max"));
		
		String capName = "ALICE";
		
		// Convert case before comparison for case-insensitive matching.
		System.out.println(name.equals(capName.toLowerCase()));
		
		String words = "Java Python, C++, Java";
		
		// replace returns a new string; original remains unchanged.
		System.out.println(words.replace("Java", "SQL"));
		System.out.println(words);
		
		// split by comma and trim each part to remove extra spaces.
		String[] parts = words.split(",");
		for (int i = 0; i < parts.length; i++) { // for-each loop also works
			System.out.println(parts[i].trim());
		}
		
		// StringBuffer is mutable, so append updates the same object.
		StringBuffer bf = new StringBuffer("Hello");
		bf.append(" Hello Java");
		System.out.println(bf);	
		
		// trim removes leading and trailing spaces.
		String s6 = "       space     ";
		System.out.println("This is without trim of s6: " + s6);
		System.out.println("This is with trim of s6: " + s6.trim());
	}

}