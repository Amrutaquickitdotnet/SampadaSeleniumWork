package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_011_ArrayList {

	public static void main(String[] args) {
// Interface implements classname
		List<String> datalist = new ArrayList<String>();
		
		
		// class extends with another class
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// Add Element in collections

		numbers.add(12);
		numbers.add(12);
		numbers.add(14);
		numbers.add(15);
	
		//System.out.println(numbers);
		// Traversing list through for loop
		
		/*
		 * for(int i =0; i<numbers.size(); i++) { System.out.println(numbers); }
		 */
		
		for(int dataNumber:numbers) {
			System.out.println(dataNumber);
		}
		
		System.out.println("***************************");
		
		datalist.add("Madras");
		datalist.add("Madras");
		datalist.add("Delhi");
		datalist.add("Pune");
		datalist.add("Zimbabwe");

		for(String countryList:datalist) {
			System.out.println(countryList);
		}

		}

	}


