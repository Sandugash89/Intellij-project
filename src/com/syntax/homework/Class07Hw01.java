package com.syntax.homework;

import java.util.Scanner;

public class Class07Hw01 {

	public static void main(String[] args) {
		/*
		 * Calculate sum of all even and all odd numbers from range 1 to 100
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Even numbers");
		int a = 0;
		for (int b = 2; b <= 100; b += 2) {
			System.out.print(b + " ");
			a += b;
			
		}
		System.out.println("The sum is " + a);
		

		System.out.println("Odd numbers");
		int c = 0;
		for (int d = 1; d<=100; d+=2) {
			if(d%2==1) {
			System.out.print(d + " ");
			}c+=d;
		}
		System.out.println("The sum is " + c);
		
		
		System.out.println("---------------Other shorter way-------------");
		
		int eSum=0;
		int oSum=0;
		
		for (int i=1; i<=100; i++) {
			
			if (i%2==0) {
				eSum+=i;
			}else {
				oSum+=i;
			}
		
		}
		
		System.out.println("Sum of even numbers = "+eSum);
		System.out.println("Sum of odd numbers = "+oSum);
	}

}
