package com.learning;

public class Example_003_String {

	public static void main(String[] args) {
		// java uses concept of String literal. Suppose there are 5 referencevariables
		// All refers to one Object, it will be get affected by all the reference
		// variable
		// String Objects are immutable in nature
		// 1. ClassLoader => uses String Object as an argument , Thread Safe , Security,
		// Heap space

		String name = "Sampada";

		name = name.concat("RatnaParkhi");
		System.out.println(name);

		String text = "I am Learning JAVA";
		String text1 = "I AM ENJOYING";
		System.out.println(text.indexOf("am"));
		String task = "I want to drink cofee";
		System.out.println(text.charAt(17));
		System.out.println(text.contains("JAVA"));// boolean expression
		System.out.println(text.toUpperCase());
		System.out.println(text1.toLowerCase());
		System.out.println(task.replace("cofee", "Tea"));
		System.out.println(text.startsWith("I"));// Lakme_0051
		String date = "21-02-2022";
		String[] newDate = date.split("-");
		System.out.println("Day of year" + ":" + newDate[0]);
		System.out.println("Month of year" + ":" + newDate[1]);
		System.out.println("Current year" + ":" + newDate[2]);
		String product = "Lakme_Product001";
		String[] productName = product.split("_");
		System.out.println("Product brand" + ":" + productName[0]);
		System.out.println("Product name" + ":" + productName[1]);

		String type = "    Hello    ";
		System.out.println(type + "Before removing spaces");
		System.out.println(type.trim() + " " + "After removing spaces");
		System.out.println(text.endsWith("C#"));
		System.out.println(text.lastIndexOf("A"));

		String s = new String("Welcome");

		String s1 = "java";
		char ch[] = { 'a', 'e', 'i', 'o', 'u' };
		// conversion of char[] to string

		String s2 = new String(ch);
		System.out.println(s2);
		String s3 = new String("example");

		System.out.println(s1);
		System.out.println(s3);

		String s4 = "somename";// SCP only contain 1 Object

		s4 = new String("somename"); // 2 with my same variable name
		System.out.println(s4);

		// find out length if string
		System.out.println("Length of String s is " + s.length());

		String first = "java programming";
		String second = "Java programming";

		String third = "python programming";

		boolean result1 = first.equalsIgnoreCase(second);
		System.out.println(result1);

		boolean result2 = first.equalsIgnoreCase(third);
		System.out.println(result2);

		String example1 = "This is the \"test\" class";
		System.out.println(example1);

		String empty = "";
		System.out.println(empty.isEmpty());
	}

}
