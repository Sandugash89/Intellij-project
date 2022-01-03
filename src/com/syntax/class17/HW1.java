package com.syntax.class17;

public class HW1 {
	/*
	 * Write a java class that have 4 constructors 
	 * with 4 different access levels of constructors(private,public,default,protected) and 
	 * create 4 objects of this class: 1 - inside same class; 
	 * 2 - from outside the class; 
	 * 3 - from different class inside different package  and observe result.
	 */
		HW1(){
			System.out.println("default");
		}
		private  HW1(String name) {
			System.out.println(name);;
		}
		
		public HW1(String name, int age) {
			System.out.println(name + age);
		}
		protected HW1(char c) {
			System.out.println(c);
		}
		
			public static void main(String[]args) {
				new HW1();
				new HW1("sandugash");
				new HW1("Sandugash", 31);
				new HW1('s');
			}
}
