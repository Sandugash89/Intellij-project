package com.syntax.homework;



public class Class10HwGroup08 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.

		 */
	
		   int n = 10, num1 = 0, num2 = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; i++) {
		      System.out.print(num1 + ", ");

		      // compute the next term
		      int num = num1 +num2;
		      num1 = num2;
		     num2 = num;
}}}
