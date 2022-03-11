package com.inheritancecncept;

public class Nano extends Car {

	public void rateofnano() {
		System.out.println("Rate of nano is less than other cars");
		Engine nano = new Engine();
		nano.startEngine();
		nano.stopEngine();
	}
}
