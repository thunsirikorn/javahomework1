package com.google.javaHomework122;

public class VariableScope {
	public static void main(String[] args) {
		bark();
	}
	public static void bark() {
		String dogName = "Lucky";
		System.out.println("The dog Name = " + dogName + " bark");
	}
}