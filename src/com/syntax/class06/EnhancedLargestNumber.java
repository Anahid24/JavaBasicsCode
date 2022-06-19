package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		//Write a program to initialize 3 variables without using syso
		
		int num1=2000;
		int num2=200;
		int num3=20;
		
		/* Compiler can initialize variables to it's default values
		 *  int -->0
		 *  double --> 0.0
		 *  boolean --> false
		 *  String --> null
		 */
		int largest=0;
		
		if(num1 > num2 && num1 > num3) {
			largest=num1;
		}else if (num3 > num1 && num3 > num2) {
			largest=num3;
		}else if (num2 > num1 && num2 > num3) {
			largest=num2;
		}else {
			System.out.println("All numbers are equal");
		}
		if (largest != 0) {
		System.out.println("The largest number is "+largest);
		//the local variable may not have been initialized
		}

	}

}
