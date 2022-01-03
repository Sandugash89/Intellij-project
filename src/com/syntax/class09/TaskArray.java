package com.syntax.class09;

public class TaskArray {

	public static void main(String[] args) {
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 *
		 */
  String[] arr= {"Java", "Satuday", "day.", "codding "," is "};
  
 
	  System.out.println(arr[1]);
	  System.out.println(arr[4]);
	  System.out.println(arr[0]);
	  System.out.println(arr[3]);
	  System.out.println(arr[2]);
	  
	  
	  System.out.println("_______________________________________");
	  for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	  
	  }
  
 
	}


