package com.learning;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Example_019_HashTable {

	public static void main(String[] args) {
		/*
		 * // null key allowed as an Object there can be any number of null value
		
		 */
		Hashtable<String, Integer>table = new Hashtable<String, Integer>();
		//adding element in table
		table.put("Sampada", 27);
		table.put("Amruta", 20);
		table.put("Test", 25);
		table.put("Praveen", 30);
		table.put("Test33", 34);
	// removing element 
		table.remove("Praveen");
		table.remove(20);
		System.out.println("Size of table:"+ table.size());
		//printing names 
		System.out.println(table);
		if(table.containsKey("Amruta")) {
	Integer a =		table.get("Amruta");
	System.out.println("Value for Key :"+"\"Amruta\" is : -"+ a);
		}
	}
}
