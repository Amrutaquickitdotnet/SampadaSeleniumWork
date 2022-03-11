package com.encapsulation;

public class TestEncapsulated {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Sampada");
		s.setAddress("Pune");
		System.out.println(s.getAddress());
		System.out.println(s.getName());
	}
}
