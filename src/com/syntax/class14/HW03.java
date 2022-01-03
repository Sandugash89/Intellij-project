package com.syntax.class14;

public class HW03 {
	public static void main(String[]args) {
	
	/*
	 * a String a ”Is it saturday? Is it raining? Do we have a Java Class today?”
	 * How would you find out how many sentences are in that String?
	 */
	
	String a ="Is it Saturday? Is it raining? Do we have a java Class today?";
	System.out.println(a.split("[?.!]").length);

	
	
	}			

}
