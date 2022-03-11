package com.learning;

import java.util.Iterator;
import java.util.Vector;

public class Example_013_vector {

	public static void main(String[] args) {
Vector<String>v = new Vector<String>();
v.add("Sampada");
v.add("Sampada");
v.add("Test");
Iterator<String> itr  =v.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
	
}
	}
}


