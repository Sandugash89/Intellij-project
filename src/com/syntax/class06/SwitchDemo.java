package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * rules:
		 * 1.values n case MUST be same data type as a Variable in switch
		 * 2. we can not have Duplicate Cases
		 */
		char gender = 'm';
		
		String description;
		switch (gender) {
		case 'm':
			description = "Male";
			break;
		case'M':
			description="Male";
		case 'f':
			description = "Female";
			break;
			default:
			description ="Unknown";
		}
System.out.println(gender+" means "+ description);
/*
 * limitation of operators
 * 1. we can not use logical Operators
 * 2.we can not use relational operators
 * 
 * limitation of data types
 * 1. can not use boolean
 * 2. can not use double/float
 * 3. can not used with long
 */

	}
}
