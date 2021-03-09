package com.google.javaHomework122;

public class BreakFor {	
	public static void main(String[] args) {
		for(int count = 20; count >= 0; count--) {
			if(count == 11)
				break;
				System.out.println("Count : " + count);	
		}
		System.out.println("Break count = 11");
	}
}
