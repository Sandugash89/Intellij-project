package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
	/*
	 * we need to capture from a user
	 * based on the country we have to define a favorite food
	 */
Scanner in=new Scanner(System.in);
System.out.println("Capture a country from a user");
String country=in.next();
String food;
switch(country.toLowerCase()) {
case "russia" :
	food="soup";
	break;
case "kazakhstan":
food="beshbarmak";
break;
default:
	food="Unknown";

	

} if (!food.equals("Unknown")) {
System.out.println("National food of "+ country +" is a "+ food);
	} else {
		System.out.println("Try another country");
	}

}}
