package com.learning;

public class Example_005_Array2 {

	public static void main(String[] args) {
		
    int[] numbers = new int[5];
    numbers[0]= 12;
    numbers[1]= 14;
    numbers[2]= 13;
    numbers[3]= 12;
    numbers[4]= 12;
    
    System.out.println("0th index position "+ numbers[0]);
    System.out.println("1st index position "+ numbers[1]);
    System.out.println("2nd index position "+ numbers[2]);
    System.out.println("3rd index position "+ numbers[3]);
    System.out.println("4th index position "+ numbers[4]);
   // System.out.println("5th index position "+ numbers[5]);
    // fetch array 
    
   	/*
   	 * for(int i =0; i<numbers.length; i++) { System.out.println(numbers[i]); }
   	 */
       
       for(int a :numbers) {
       	
       	System.out.println(a);
       }
   		 
    
    String[] vowels = new String[5];
    vowels[0] ="a";
    vowels[1] ="e";
    vowels[2] ="i";
    vowels[3] ="o";
    vowels[4] ="u";
    System.out.println("0th index position "+ vowels[0]);
    System.out.println("1st index position "+ vowels[1]);
    System.out.println("2nd index position "+ vowels[2]);
    System.out.println("3rd index position "+ vowels[3]);
    System.out.println("4th index position "+ vowels[4]);
   
    
    for(String vowelresults:vowels) {
    System.out.println("The vowels results are :"+ vowelresults);	
    	
    }
		
	}
	

}
