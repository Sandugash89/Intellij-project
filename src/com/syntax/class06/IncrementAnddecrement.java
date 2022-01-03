package com.syntax.class06;

public class IncrementAnddecrement {

	public static void 	main(String[] args) {
		
		int num=100;
		num=num+1;
		num+=1;
		System.out.println(num);
		
		num++; //increment value of variable by 1
		System.out.println(num);
		
		num--; // decrement value of variable by 1
		System.out.println(num);
		
		//10++ cannot be used with values, only with variable
		
		float f=10.99f;
		f++;
		System.out.println(f);
	}

}
