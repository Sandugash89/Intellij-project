package com.syntax.homework;

public class Class10Hw03 {

	public static void main(String[] args) {
		/*
		 * 2. Retrieving all elements from 2D array
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */
		
		String[][]cars= {
				{"american","german","korean","italian"},
				{"chevrolet","bmw","toyota","fiat"}
		};
for(String []car :cars) {
	for(String i :car) {
		System.out.print(i + " ");
	}
	System.out.println();
}
	System.out.println("------------------------------------------------");
	
	
	for(int i=0; i<cars.length; i++) {
		for (int j=0; j<cars.length+2; j++) {
			System.out.print(cars[i][j]+" ");
		}
		System.out.println();
	}
}

	

	}


