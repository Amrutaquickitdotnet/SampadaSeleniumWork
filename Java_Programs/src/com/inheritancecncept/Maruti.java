package com.inheritancecncept;

public class Maruti extends Car {

	
	public void marutiStartDemo() {
		System.out.println("Maruti is outdated");
		Engine marutiEngine = new Engine();
		marutiEngine.startEngine();
		marutiEngine.stopEngine();
		
	}
}
