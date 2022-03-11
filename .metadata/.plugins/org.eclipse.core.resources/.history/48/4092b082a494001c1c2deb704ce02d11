package com.learning;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Example_018_HashTableExample3
{

	public static void main(String[] args) {
		/*
		 * // null key allowed as an Object there can be any number of null value
		
		 */
		Hashtable<String, Integer>table = new Hashtable<String, Integer>();
		//adding element in table
		table.put("Sampada", 27);
		table.put("Amruta", 20);
		table.put("Test", 25);
		table.put("Sampada", 23);
		table.put("Praveen", 30);
		table.put(null, null);
		table.put(null, 21);
		table.put(null, 22);
		table.put(null, 23);
		table.put("Ashok", null);
		table.put("Aamir", null);
		table.put("Bobby", null);
		System.out.println("Size of table:"+ table.size());
		//printing names 
		System.out.println(table);
		if(table.containsKey("Amruta")) {
	Integer a =		table.get("Amruta");
	System.out.println("Value for Key :"+"\"Amruta\" is : -"+ a);
		}
	}
}
