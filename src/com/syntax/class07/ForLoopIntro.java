package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		for(int i=1;    i<=5;      i++) {
			System.out.println("Hello");
		}
System.out.println("------print numbers from 1 to 20----------");
/*
 * 1. start point
 * 2. end point
 * 3. increment/decrement
 */
for(int i=1; i<=20; i++) {
	System.out.println(i+" ");
}
System.out.println("------print numbers from 100 to 20----------");
for(int a=100; a>=20; a--) {
	System.out.println(a+" ");
}
System.out.println("------print Even numbers from 1 to 50----------");

for(int b = 1; b<=50; b++) {
	if(b%2==0) {
	System.out.println(b+" ");
}}

System.out.println("------print Even numbers from 1 to 50----------");

for(int b = 2; b<=50; b+=2) {
	
	System.out.println(b+" ");
}

System.out.println("what is the output----???");
for(int a=1; a<=20; a+=5) {
	System.out.println(a);
}
System.out.println("end of code");
	}

}
