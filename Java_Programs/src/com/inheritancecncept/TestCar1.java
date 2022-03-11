package com.inheritancecncept;

public class TestCar1 {
//has a Relationship
	public static void main(String[] args) {

		Maruti m2 = new Maruti();

		m2.setColor("White");
		m2.setmaxSpeed(100);

		m2.carinfo();
		System.out.println("********************");
		m2.marutiStartDemo();

		Nano n = new Nano();
		n.setColor("Orange");
		n.setmaxSpeed(120);
		n.carinfo();

		n.rateofnano();
	}
}
