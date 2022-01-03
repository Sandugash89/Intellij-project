package com.syntax.homework;

public class Class10HwGroup10 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
		int arr[]= {100,200,300,400,500,600,700,750,800};
		int largest=0;
		int secondlargest=0;
		for(int num:arr) {
			if (num>largest) {
				largest=num;
			}}
		for(int num:arr) {
			 if(largest>num && num>secondlargest) {
				secondlargest=num;
			 }
		}
		System.out.println("Second largest number in array is "+ secondlargest);

	
		System.out.println("----------------");
		
		int[] numbers= {15,10,17,13,30};
		int Largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MAX_VALUE;
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>Largest) {
				SecondLargest=Largest;
				Largest=numbers[i];
			}else if (numbers[i]>SecondLargest && Largest!=numbers[i]) {
				SecondLargest=numbers[i];
			}
			
		}
		System.out.println("Second largest number in array is "+ SecondLargest);
	}
}
