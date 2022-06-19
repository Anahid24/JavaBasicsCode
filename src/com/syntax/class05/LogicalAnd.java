package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean job=true;
		double salary=1000000;
		
		if(job && salary>=100000) {
			System.out.println("I am super duper happy");
		}
		
		System.out.println("-----------------------------");
		
		boolean study=true;
		boolean homework=true;
		boolean practice=true;
		
		if(study && homework && practice) {
			System.out.println("You will succede");
		}else {
			System.out.println("You will struggle");
		}
		
		System.out.println("-----------------------------");
		
		/*Write a program to find the largest number among three numbers using  provided by a user (numbers must be distinguished */
		
		int num1=65;
		int num2=66;
		int num3=23;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("The largest number is "+num1);
		}else if(num3 > num1 && num3 > num1) {
			System.out.println("The largest number is "+num3);
		}else if (num2 > num2 && num2 > num3) {
			System.out.println("The largest number is "+num2);
		}

	}

}
