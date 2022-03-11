package com.learning;

import java.util.Scanner;

public class Example_008_Scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which cofee do you want?");
		String choices =s.next();
		
	switch (choices) {
	case "1": {
		System.out.println("You can take black cofee");
		break;
		
	}
case "2": {
		System.out.println("You can Cappachino");
		break;
		
	}
case "3": {
	System.out.println("You can get Espresso");
	break;
}
case "4": {
	System.out.println("You will get Latte");
	break;
	
	
}
default:
	System.out.println("Invalid Choice");

	}
}
	
}



