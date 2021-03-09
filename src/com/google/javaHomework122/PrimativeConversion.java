package com.google.javaHomework122;

public class PrimativeConversion {
	public static void main(String[] args) {
		float newFloat = 9.9f;
		int newInt = (int) newFloat;
		System.out.println("float to int " + newInt);
		
		int myInt = 9;
		float myFloat = myInt;
		System.out.println("int to float " + myFloat);
		
		double myDouble = 9.5d;
		float myFloatd = (float) myDouble;
		System.out.println("double to float " + myFloatd);
		
		char myChar = 99;
		int myIntc = (int) myChar;
		System.out.println("char to int " + myIntc);
	}
}
