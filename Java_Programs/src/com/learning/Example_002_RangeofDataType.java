package com.learning;

public class Example_002_RangeofDataType {

	public static void main(String[] args) {
		// Declare variables
		// type variablename = value;
		String name = "Sampada";
		System.out.println(name);

		int myNum = 23;
		System.out.println(myNum);
		myNum = 25;
		System.out.println(myNum);

		final int myNumber = 34;

		char myLetter = 'D';
		System.out.println(myLetter);

		char letter = 65;
		System.out.println(letter);

		// length of character data type

		boolean myBool = false;
		if (myBool == true) {
			System.out.println("I am in True");
		} else {
			System.out.println("I am in false");
		}

		String name1 = "Sampada";
		System.out.println("Hello" + " " + name1);// concate +

		String name2 = "Hello";
		System.out.println(name2.concat(name1));

		int x = 6;
		int y = 7;
		System.out.println(x + y);

		String num1 = "34";
		String num2 = "56";
		System.out.println(num1 + num2);
		// convert string to number

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int result = a + b;
		System.out.println(result);
		
		// Declare many variables 
		
		int p = 5, q = 4, r =8;
		System.out.println(p+q+r);
		int age = 18;
		
		

	}

}
