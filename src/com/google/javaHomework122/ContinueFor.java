package com.google.javaHomework122;

public class ContinueFor {
	public static void main(String[] args) {
		for(int count = 0; count <= 20; count++) {
			if(count == 11)
				continue;
				System.out.println("Count : " + count);
		}
		System.out.print("Continue count = 11");
	}
}
