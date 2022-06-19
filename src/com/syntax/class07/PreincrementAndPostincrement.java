package com.syntax.class07;

public class PreincrementAndPostincrement {

	public static void main(String[] args) {
		
		//post increment
		// first use then increment
		int num=10;
		
		int result=num++;
		
		System.out.println("Value of num = "+num); //11
		System.out.println("Value of result = "+result); //10
		
		System.out.println();
		
		//pre increment
		//first increment and then use
		int num1=10;
		
		int result1=++num1;
		
		System.out.println("Value of num1 = "+num1); //11
		System.out.println("Value of result1 = "+result1); //11

	}

}
