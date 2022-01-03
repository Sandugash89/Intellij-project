package com.syntax.homework;

import java.util.Scanner;

public class Class06Hw01 {

	public static void main(String[] args) {
		/*
		 * HW:  Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: 
		 * using if statement and switch case.
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter number 1");
double num1=scan.nextDouble();
System.out.println("Please enter number 2");
double num2=scan.nextDouble();
System.out.println("Please, enter your operator ");
char op=scan.next().charAt(0);
double solve=0;
switch(op) {
case'*':
solve=num1*num2;
break;
case'-':
	solve=num1-num2;
	break;
case'+':
	solve=num1+num2;
	break;
case'/':
	if(num2!=0) {
		solve=num1/num2;
	} else {
		System.out.println("Can not divide by 0");
	}
	default:
		System.out.println("Entry is invalid");
		
} System.out.println(solve);
scan.close();
}}
