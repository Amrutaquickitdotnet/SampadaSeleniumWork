package com.abstraction.interfaceimpl;

public class Student implements Person, PersonTest{

	@Override
	public void display() {
		System.out.println("Students behaviour can be differnt");
	}

	@Override
	public void speakability() {
		System.out.println("Students are talkatives");
		
	}

}
