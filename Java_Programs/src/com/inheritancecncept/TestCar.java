package com.inheritancecncept;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setColor("Red");
		c.setmaxSpeed(300);
		
		c.carinfo();
		System.out.println("****************");
		Maruti m = new Maruti();
		m.setColor("Blue");
		m.setmaxSpeed(150);
		
		m.carinfo();

	}

}
