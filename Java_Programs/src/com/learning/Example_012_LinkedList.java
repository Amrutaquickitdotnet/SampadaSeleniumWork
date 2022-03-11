package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example_012_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> data = new LinkedList<String>();
		data.add("Sampada");//0
		data.add("Sampada");
		data.add(0, "Test");
		data.addFirst("Ratnaparkhi");
		data.addLast("Selenium");
		
		for(String testData:data) {
			System.out.println(testData);
		}
		
		// deletion 
		System.out.println("After string removal************");
		data.remove("Sampada");
		data.remove(2);
		data.removeLast();
		for(String testData:data) {
			System.out.println(testData);
		}
		}

	}


