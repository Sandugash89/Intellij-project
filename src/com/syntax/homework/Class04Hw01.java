package com.syntax.homework;

import java.util.Scanner;

public class Class04Hw01 {
	public static void main(String[] args) {
	/**
	 * Create a Java program to capture 2 numbers from a user and define which
	 * number is the largest.
	 */
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	
	int num1 = input.nextInt();
	
	System.out.println("Please, enter a number");
	
	int num2=input.nextInt();
	
	if(num1>num2){
		System.out.println("The number " + num1 + " larger than " + num2);
	} else {
		System.out.println("The number " + num2 + "larger than " + num1);
	}

}
}
