package com.syntax.homework;

public class Class09hw04 {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 * 
		 */
		int sum=0;
 int[]arr= new int[5];
 arr[0]=10;
 arr[1]=20;
 arr[2]=30;
 arr[3]=40;
 arr[4]=50;
 for (int i=0; i<arr.length; i++) {
	 System.out.print(arr[i]+" ");
	 sum+=arr[i];
 }
 System.out.println("Sum of all elements "+sum);
 
	}

}
