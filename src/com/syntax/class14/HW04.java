package com.syntax.class14;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// How would you reverse a String character by character?
		
		String str= "Sandugash";
		String strarr="";
		for(int i=str.length()-1; i>=0; i--) {
		strarr+=str.charAt(i);
		}
		System.out.println(strarr);
		
		
		System.out.println("-----------------");
		
		String name="Sandugash";
		StringBuilder name2=new StringBuilder(name);
		name2.reverse();
		System.out.println(name2);
		name=name2.toString();
				
		}
	

		
		
	}


