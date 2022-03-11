package com.abstraction.interfaceimpl;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person lec = new Lecturer();
lec.display();
lec.speakability();

PersonTest test = new Lecturer();
test.speakability();

Person stu = new Student();
stu.display();
	}

}
