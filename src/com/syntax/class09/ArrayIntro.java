package com.syntax.class09;

public class ArrayIntro {
	public static void main(String[]args) {
		int num=10;
		System.out.println(num);
		
		System.out.println("-------------------------");
		
		int[] array=new int[4];
		array[0]=12;
		array[1]=10;
		array[2]=13;
		array[3]=14;
		System.out.println(array[2]+array[0]);
		
		System.out.println("-------------------------");
		// I need to create an array 
		// that will hold 3 elements of double type of values
		double[] arr=new double[3]; // storing 3 elements inside an array that we named arr
		
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.09;
		
		//can I replace value from an array?
		arr[1]=100.99;
		System.out.println(arr[1]);
		
		System.out.println("-------------------------");
		String[] colors= new String [4];
		
		colors[1]="Blue";
		colors[2]="Black";
		colors[3]="Yellow";
		//colors[4]="Green"; ArrayIndexOutOfBoundsException
			// System.out.println(colors[4]; ArrayIndexOutOfBoundsException
		//see how many elements inside array/what is the size of an array
		System.out.println("Size of array is "+colors.length);
		System.out.println(colors[0]);
		
	}

}
