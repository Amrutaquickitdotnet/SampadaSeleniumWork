package com.learning;

import java.util.Scanner;

public class Example_009_ConversionofTemperature {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in Farenhite");
	// hasnextDouble => Only check whether next element is available in array returns true and false 
		//nextDouble => evaluate my array value 
	 while(s.hasNextDouble()) {
	double f =	 s.nextDouble();
	 double cel = 5/9.0*(f-32);
	System.out.println("Temperature in celsius"+ cel);
	
	 }
	  s.close();

		}
}


