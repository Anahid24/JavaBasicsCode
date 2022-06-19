package com.syntax.class05;

import java.util.Scanner;

public class CityAndTempHomeworkPart2 {

	public static void main(String[] args) {
		
		/* #2:
		 * 
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius 
		 * and print “The temperature is the city __ is __”
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your city");
		String city=input.next();
		
		System.out.println("Please enter the temperature");
		int temp=input.nextInt();
		
		int celsius;
		celsius=(temp-32)*5/9;
		
		System.out.println("The temperature is the city "+ city +"cis "+ celsius);
		

	}

}
