package com.syntax.homework;

public class Class09Hw01 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
   String[] car = {"Toyota", "BWM","Tesla", "Mazda","Honda","Kia"};
   
   for (int i=0; i<car.length; i++) {
	   
	   System.out.println(car[i]);
   }
   // second version 
   String[] car1 = {"Toyota", "BWM","Tesla", "Mazda","Honda","Kia"};
   for(String car2 :car1) {
	   System.out.println(car2);
   }
   
   
	}

}
