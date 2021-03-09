package com.google.javaHomework122;

public class Grade {
	public static void main(String[] args) {
		int grades = 80;
		
	/*	if(grades >= 80) {
			System.out.print("A");
		} else if (grades >=70 && grades < 80) {
			System.out.print("B");
		} else if (grades >=60 && grades < 70) {
			System.out.print("C");
		} else if (grades >=50 && grades < 60) {
			System.out.print("D");
		} else if (grades >=40 && grades < 50) {
			System.out.print("F");
		} else {
			System.out.print("E");
		} */
		
		
		switch(grades) {
		case 40:
			System.out.print("F"); break;
		case 50:
			System.out.print("D"); break;
		case 60:
			System.out.print("C"); break;
		case 70:
			System.out.print("B"); break;
		case 80:
			System.out.print("A"); break;
		
		default:
			System.out.print("E");
			
		}
	} 
}
