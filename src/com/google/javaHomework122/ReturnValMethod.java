package com.google.javaHomework122;

public class ReturnValMethod {
	public static void main(String[] args) {
		String myWord = "Hello World";
		System.out.print(greeting(myWord));
	}
	public static String greeting(String word) {
		return word;
	}
}
