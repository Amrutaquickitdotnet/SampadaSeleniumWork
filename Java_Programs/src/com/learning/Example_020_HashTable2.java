package com.learning;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Example_020_HashTable2 {

	public static void main(String[] args) {
		/*
		 * // null key allowed as an Object there can be any number of null value
		
		 */
		Hashtable<Integer, String>table = new Hashtable<Integer, String>();
		//adding element in table
		table.put( 27, "Test");
		table.put(20, "Amruta");
		
	// removing element 
		
		table.remove(20);
		System.out.println("Size of table:"+ table.size());
		//printing names 
		System.out.println(table);
		
	
	}
}
