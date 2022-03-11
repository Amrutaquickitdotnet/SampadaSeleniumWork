package com.polymorphism;

public class TestBank {

	public static void main(String[] args) {
		HDFC bank;
		
		 bank = new HDFC();
		System.out.println("HDFC bank rate are"+ bank.getRateofInterest());
		
		
		SBI s = new SBI();
		System.out.println("SBI bank rate are"+s.getRateofInterest());
		
		Axis ab = new Axis();
		System.out.println("AXIS bank rate are"+ab.getRateofInterest());
		
	}

}
