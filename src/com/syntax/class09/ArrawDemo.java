package com.syntax.class09;

public class ArrawDemo {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it A,B,C,D,E,F.
		 * Then print a grade B
		 * 
		 * 1 way of creating an array;
		 */
    char[] grade=new char[6];
    grade[0]='A';
    grade[1]='B';
    grade[2]='C';
    grade[3]='D';
    grade[4]='E';
    grade[5]='F';
    
    System.out.println(grade[1]);
   
    int num; // declare a variable
    num=10; // initialize
    
    char[] gender; // declare an array
    gender=new char[2]; //initialize
    
    //2 way of creating an array
    
    char[] gradeArray= {'A', 'B','C', 'D'};
    
    System.out.println(gradeArray.length); //4
    System.out.println("Element with index 2 is "+ gradeArray[2]);
    
    
    String[] name= {"OLeksandr", "Naiya","Mehmet", "Emilija"};
    name[0]="Priyasri";
    		System.out.println("After change value is "+name[0]);
    
    //name[4]="John"; //ArrayIndex out of Bounds Exception
    //System.out.println(name[4]); //Array Index out Of Bounds Exception;
    
	}

}
