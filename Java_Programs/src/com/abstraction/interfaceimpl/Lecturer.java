package com.abstraction.interfaceimpl;

public class Lecturer implements  PersonTest{

	@Override
	public void display() {
		System.out.println("Lecturer can teach inside college");
		
	}

	@Override
	public void speakability() {
		System.out.println("Lecturer ability is more than student");
		
	}

}
