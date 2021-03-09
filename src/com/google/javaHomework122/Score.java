package com.google.javaHomework122;

public class Score {
	public static void main(String[] args) {
	int scores = 88;
	
	if(scores >= 80) {
		System.out.print("Good");
	} else if (scores >= 50 && scores < 80) {
		System.out.print("normal");
	} else { 
		System.out.print("fail"); 
	}
}
}