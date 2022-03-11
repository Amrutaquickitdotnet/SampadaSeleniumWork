package com.learning;

import java.util.Iterator;
import java.util.Stack;


public class Example_014_StackExample {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Sampada");
		stack.push("Praveen");
		stack.push("Amruta");
		stack.pop();

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
