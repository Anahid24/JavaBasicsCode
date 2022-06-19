package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age=scanner.nextInt();
		
		if (age>=18) {
			System.out.println("You will be issued a drivers license");
		}else {
			System.out.println("You will be issued learners permit");
		}
		
	}
}
