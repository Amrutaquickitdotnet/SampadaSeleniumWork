package com.inheritancecncept;

public class Car {
	
private String color;//Features
private int maxSpeed;

public void carinfo() {
	System.out.println("Car Colour "+ color + "Speed of Car"+ maxSpeed);
	
}

public void setColor(String colour) {
	this.color = colour;
	
}


public void setmaxSpeed(int speed) {
	this.maxSpeed = speed;
	
}
}
