package com.learning;

public class Example_004_Array {

	public static void main(String[] args) {
		
    int[] numbers = {1,2,12,34,56}	;
    
    
    // fetch array 
    System.out.println("0th index position "+ numbers[0]);
    System.out.println("1st index position "+ numbers[1]);
    System.out.println("2nd index position "+ numbers[2]);
    System.out.println("3rd index position "+ numbers[3]);
    System.out.println("4th index position "+ numbers[4]);
   // System.out.println("5th index position "+ numbers[5]);
	/*
	 * for(int i =0; i<numbers.length; i++) { System.out.println(numbers[i]); }
	 */
    
    for(int a :numbers) {
    	
    	System.out.println(a);
    }
		
		
	}
	

}
