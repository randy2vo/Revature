package com.day2;

public class TestArrays {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		for(int i =0; i < numbers.length; i++){
			System.out.println("Numbers = " + numbers[i]);
		}
		
		System.out.println("***************");
		
		for(int num : numbers) {
			System.out.println("Numbers = " + num);
		}
		
		System.out.println("***************");
		
		int[][] matrix2x3 = {{1, 2, 3}, {4, 5, 6}};
		
		for(int row = 0; row < matrix2x3.length; row++) {
			   for(int col = 0; col < matrix2x3[row].length; col++) {
			    System.out.print(matrix2x3[row][col] + "\t");
			   }
			   System.out.println();
			  }
		System.out.println("***************");
	
		int[][] matrix3x3 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int row = 0; row < matrix3x3.length; row++) {
			   for(int col = 0; col < matrix3x3[row].length; col++) {
			    if(matrix3x3[row][col] % 2 == 0) { 
			    	evenCount++;
			    } else {
			    		oddCount++;
			    	}
			    }
			   }
		
		System.out.println("Total even numbers in 3x3 matrix = " + evenCount);
		System.out.println("Total odd numbers in 3x3 matrix = " + oddCount);
		
		System.out.print("Diagonal elements = ");
		for (int i = 0; i < matrix3x3.length; i++) {
			System.out.print(matrix3x3[i][i] + " ");
		}
		System.out.println();
	}
}