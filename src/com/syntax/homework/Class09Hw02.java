package com.syntax.homework;

public class Class09Hw02 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.

		 */
String[] anim = {"tiger","lion","snake","cat","dog","hors"};

for(int i=0; i<anim.length; i++) {
	System.out.print(anim[i]+" ");
	
		
	}

String[] animal = {"tiger","lion","snake","cat","dog","hors"};
for (String an :animal) {
	System.out.print(an + " ");
}
}

}
