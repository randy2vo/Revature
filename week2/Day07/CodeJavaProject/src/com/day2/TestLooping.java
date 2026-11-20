package com.day2;

public class TestLooping {
	public static void main(String[] args) {
	
	int i = 0;	
	for(i = 1; i <= 5; i++ ) {
		System.out.println(i);
	}
	
	System.out.println(i);
	System.out.println("***************");
	
	int j = 5;
	while(j > 1) {
		System.out.println("J = " + j);
		j--;
		}
	
	int k = -5;
	do {
		System.out.println("K = " + k);
		k--;
	}	while(k >= 5);
	
	}
}
