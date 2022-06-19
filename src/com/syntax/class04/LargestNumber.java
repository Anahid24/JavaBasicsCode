package com.syntax.class04;

public class LargestNumber {

	public static void main(String[] args) {
		
		//#3
		
		int num1= 26;
		int num2= 18;
		int num3= 14;
		
		if (num1 > num2 & num1 > num3) {
			System.out.println(num1+" is the largest number");
		}else if (num1 < num2 & num1 < num3) {
			System.out.println(num1+" is the smallest number");
		}
	}

}
