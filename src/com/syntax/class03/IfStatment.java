package com.syntax.class03;

public class IfStatment {

	public static void main(String[] args) {
		
		/*
		 * declare a variable rate.
		 * If rate is more than 5 --> I am not buying a house
		 */
		
		double mortgageRate=5.5;
		
		if (mortgageRate>5) {
			System.out.println("I am not buying a house");
		}
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */
		int num1=99;
		int num2=10;
		
		if(num1>num2) {System.out.println(num1+" is bigger than "+num2);
			
		}
		
		/*
		 * declare temperature,
		 * if temp is higher than 75 --?> I will go for a walk
		 */
		
		int temp=78;
		
		if (temp>75) {//code condition inside if {}
			          //when condition is true
			System.out.println("I will go for a walk");	
		}else {//otherwise. Code comes to else {}
			//when condition is false
			System.out.println("I am going to study Java");
		}
		
		System.out.println("------------------------------------------");
		
		char gender='f';
		
		if (gender=='f') {
			System.out.println("You like shopping");	
		} else {
			System.out.println("You like watching sports");
		}
		System.out.println("-------------------------------------------");
		
		String browser="chrome";
		
		if (browser.equals("chrome")) {
			
			System.out.println("All test cases will be executed on chrome");
		}else {
			
			System.out.println("I am not exucuting any cases");
			System.out.println("Reason - wrong browser");
			
		}
		/*
		 * when your code 
		 */
		// mac ctrl+
		
		int temp1= 15;
		
		if (temp1<32) {
			
			System.out.println("water will freeze with the teperature");
			System.out.println("It is cold outside");
			System.out.println("Make sure to use a jaket and a scarf");
		} else {
			System.out.println("water will not freeze with temperature");
			System.out.println("It is not that cold ouside");
		  }
		    System.out.println("Continues code");
	     	System.out.println("I am cde ouside of if block");
		
	}
	
}
