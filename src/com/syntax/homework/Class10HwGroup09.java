package com.syntax.homework;


public class Class10HwGroup09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int arr[]= {65,34,23,4,0,-1,3};
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			} else if(min>arr[i]) {
				min=arr[i];
			} 
			
		}
		System.out.println("Maximum number is "+max+". "+"Minimum number is "+min);
		
		
		System.out.println("------------------");
			
		int[]number= {10,5,3,-5,15};
		int largestNumber=Integer.MIN_VALUE;
		int smallestNumber=Integer.MAX_VALUE;
		for(int i=0;i<number.length; i++) {
			if(number[i]>largestNumber) {
				largestNumber=number[i];
			}
			if (number[i]<smallestNumber) {
				smallestNumber=number[i];
			}
		}

		System.out.println(largestNumber);
		System.out.println(smallestNumber);
		
	}

}
