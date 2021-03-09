package com.google.javaHomework122;

import java.util.Scanner;

public class DoWhile2 {
	/*public static void isEven(int number) {
		if(number%2 == 0) {
			System.out.println("even : " + number);
		} else {
			System.out.println("Terminated odd : " + number);
		}
		}	*/	

	public static void main(String[] args) {
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		do {
			
			System.out.println("Enter number : ");
			i = input.nextInt();
			
			if (i%2 != 0) {
				break;
			} else {
				//DoWhile2.isEven(i);
				System.out.println("Even %2 = " + i%2);
			}
		} while (i > 0);
		
		System.out.println("Odd %2 = " + i%2 + " terminated");
		
}
}