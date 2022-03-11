package com.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Example_017_TreeSet {

	public static void main(String[] args) {

		Set<String> hash_set = new TreeSet<String>();
		hash_set.add("Cookies");
		hash_set.add("Cookies1");
		hash_set.add("Cookies2");
		hash_set.add("Cookies3");
		hash_set.add("Cookies");
		System.out.println(hash_set);
		hash_set.remove("Cookies1");
		for(String val:hash_set) {
			System.out.println(val);
		}
		System.out.println("Traversing Element through iterator");
		
Iterator<String>dataVal =		hash_set.iterator();
while (dataVal.hasNext()) {
	System.out.println(dataVal.next());

	
}
		
		
		System.out.println(hash_set);
	}
}
