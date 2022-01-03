package com.syntax.homework;

public class Class10Hw01 {

	public static void main(String[] args) {
		/*
		 * Retrieving 1 element from 2D Array
		 * Create a 2D array where you will store the following values:
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama. 
		 * After storing values print the following String:
		 * Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 */
 String [][] str= {
		 {"Mr", "Mrs","Ms","Miss"},
		 {"Smith", "Jordan", "Jackson","Obama"}
 };
System.out.print(str[0][1]+ " "+ str[1][0]+ ", ");
System.out.print(str[0][0]+ " "+ str[1][3]+", ");
System.out.print(str[0][2]+ " "+ str[1][2]+ ", ");
System.out.print(str[0][3]+ " "+ str[1][2]+". ");
	}

}
