package com.syntax.homework;

import java.util.Scanner;

public class Class04Hw04 {

	public static void main(String[] args) {
		/*
		 * 4. Create a Java program that will ask user to 
		 * input city and temperature. 
		 * Your program should convert Fahrenheit into celsius 
		 * and print “The temperature is the city __ is __”
		 */
Scanner input=new Scanner(System.in);

System.out.println("Input you city");
String city=input.next();
System.out.println("Input you temperature");
int temFahrenheit=input.nextInt();
int tempCelsius = ((temFahrenheit - 32) * 5) / 9;

System.out.println("The temperature of the "+city+" is "+ tempCelsius +"C");


	}

}
