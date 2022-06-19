package com.syntax.class05;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
     /*1. Prompt the user to enter person heights in inches. Person should be classified as one of the following: 
      * short (under 60 inch) medium(between 60 -72 inch) tall (over 72 inch) 
      * Write a program that will print whether it is a weekend or weekday. 
      *2) If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output 
      *“It is a weekend”, any other day → output “Invalid day” 
      * 3)Ask user to enter a number and then define if number is small, medium or large 
      * Small number is value between 1 and 10 Medium number is value between 11 and 100 
      * Large number is value between 101 and 1000
      */
		//#1:
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter hight in inches");
		int inches=scanner.nextInt();
		
		if (inches <= 60) {
			System.out.println("short");
		}else if (inches >= 60 && inches <= 72) {
			System.out.println("medium");
		}else if (inches >= 72) {
			System.out.println("tall");
		}
		
		System.out.println("-----------------------------");
		//#2
		System.out.println("Input day in numbers");
		int day=scanner.nextInt();
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("weekday");
		}else if (day == 6 || day == 7){
			System.out.println("weekend");
		}
		
		System.out.println("-----------------------------");
		
		//#3
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		
		if (num >= 1 && num <= 10) {
			System.out.println("small");
		}else if (num >= 11 && num <= 100) {
			System.out.println("medium");
		}else if (num >= 101 && num <= 1000) {
			System.out.println("large");
		}

	}

}
