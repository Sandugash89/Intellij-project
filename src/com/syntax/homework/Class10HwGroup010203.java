package com.syntax.homework;

public class Class10HwGroup010203 {

	public static void main(String[] args) {
	/*
	 * Create a 2D array of integer values. Print the sum of all numbers.
	 * 
	 */
int [][] arr= {
		{10, 20, 30,},
		{15, 25, 35}
};
int sum=0;
for(int i=0;i<arr.length; i++) {
	for (int j=0; j<arr.length+1;j++) {
		sum+=arr[i][j];
	}
}
System.out.println(sum);


System.out.println("----------------------------------");
/*
 * Create a 2D array or integer type where you will store odd and even numbers. 
 * Develop a program which will identify/print the even numbers only.
 * 
 */

int [][] num= {
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}
};
int even=0;
for(int i=0; i<num.length; i++) {
	for(int j=0; j<num.length+1; j++) {
		even=num[i][j];
		if(num[i][j]%2==0) {
			System.out.print(num[i][j]+" ");
		}
	}
}

System.out.println("----------------------------------");

/*
 * Create a 2D array of integers. 
 * Develop a program which will calculate the sum of  even and odd numbers for that array.
 */

int [][] num1= {
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}
};
int sumE=0;
int sumO=0;
for(int i=0; i<num1.length; i++) {
	for(int j=0; j<num1.length+1; j++) {
		if (num1[i][j]%2==0) {
			sumE+=num1[i][j];
			num1[i][j]++;
		} else {
			sumO+=num1[i][j];
			num1[i][j]++;
		}
	}
}
System.out.println("Sum of even numbers is "+ sumE);
System.out.println("Sum of odd numbers is "+ sumO);

System.out.println("----------------------------------");



	}

}
