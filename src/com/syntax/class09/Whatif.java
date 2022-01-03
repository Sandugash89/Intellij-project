package com.syntax.class09;

public class Whatif {

	public static void main(String[] args) {
		// nested loop
		/*
		 * in for loop condition have to be always TRUE
		 */
for (int i=1;i<3;i++) {
	for(int j=0;j<=2;j++) {
		System.out.println("Hello");
	
				
	} System.out.println("Good Morning");
	break;
	
	/*
	 * continue-skips current iteration and move to beginning of the loop
	 * break-exit/breaks the loop
	 */
} 
System.out.println("___________________________");
boolean morning =true;
for (int i=1;i<=3; i++) {
	System.out.println("I am for loop");
	while(morning) {
		System.out.println("Good morning");
		break;
	}
}

System.out.println("___________________________");
for (int i=1;i<3;i++) {
	
	for(int j=1;j<=2;j++) {
		
		if(j==1) {
			
			continue;
		}
		System.out.println("Hello");
	
				
	} System.out.println("Good Morning");
}
	}

}
