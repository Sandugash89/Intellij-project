package com.syntax.homework;

public class Class10Hw04 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. 
Retrieve all values from that array using 2 different loops
		 * 
		 */
String [][]grocery = {
		{"potato", "tomato","carrot","onion"},
		{"apple","grape","avacado","pear"},
		{"juice", "milk", "water", "coke"}
};
for (String[]gro:grocery) {
	for(String g :gro) {
		System.out.print(g + " ");
	}
	System.out.println();
}

System.out.println("------------------------------");
for (int i=0; i<grocery.length; i++) {
	for(int j=0; j<grocery.length+1; j++) {
		System.out.print(grocery[i][j]+" ");
	}
	System.out.println();
}
	}

}
