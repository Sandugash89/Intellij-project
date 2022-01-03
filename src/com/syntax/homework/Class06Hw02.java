package com.syntax.homework;

public class Class06Hw02 {

	public static void main(String[]args) {

// Print even numbers from 20 to 100
				 
		int num=20;
		while(num<=100) {
			System.out.print(num+" ");
			num+=2;
		}
		System.out.println("------------Another Way--------------");
		
		int num1=20;
		while(num1<=100) {
			if(num1%2==0) {
		
			System.out.println(num1+" ");
			
	}num1++;
			}
		}
	
}
