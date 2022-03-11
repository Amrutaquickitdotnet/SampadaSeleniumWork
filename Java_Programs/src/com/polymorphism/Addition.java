package com.polymorphism;

public class Addition {

	//method overloading compileTime polymorphism
	public static int add(int a , int b) {
		return a+b;
		
	}
	
	public static double add(double c,  double d) {
		return c+d;
	}
	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2.2, 2.3));
	}
}
