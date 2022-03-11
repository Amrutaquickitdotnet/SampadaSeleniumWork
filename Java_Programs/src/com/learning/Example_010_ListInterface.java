package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_010_ListInterface {

	public static void main(String[] args) {

		List<String> datalist = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// Add Element in collections

		numbers.add(12);
		numbers.add(12);
		numbers.add(14);
		numbers.add(15);
		System.out.println(numbers);
		// Traversing list through iterator
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		datalist.add("Madras");
		datalist.add("Madras");
		datalist.add("Delhi");
		datalist.add("Pune");
		datalist.add("Zimbabwe");

		Iterator<String> cityList = datalist.iterator();
		while (cityList.hasNext()) {
			System.out.println(cityList.next());

		}

	}

}
