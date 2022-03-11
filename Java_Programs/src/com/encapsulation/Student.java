package com.encapsulation;

public class Student {
// is design pattern in which wrapping of data and methods together is possible
	private String name;
	private String address;
	
	//private Data member
		// setter method
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//getter method
	public String getName() {
		return name;
	}
	
	public void setName(String studentName) {
		this.name = studentName;
	}
	
	
}
