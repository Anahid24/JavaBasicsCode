package com.syntax.class04;

import java.util.Scanner;

public class ScannerHW {

	public static void main(String[] args) {
		
		//#1
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String firstName=input.next();
		System.out.println(firstName);
		
		System.out.println(firstName+ " please enter your lastname");
		
		String lastName=input.next();
		System.out.println(firstName +" "+ lastName+" please state where you live");
		
		String state=input.next();
		System.out.println("Hi, my name is "+firstName+" "+lastName+" and I live in "+ state);
		
		System.out.println("----------------------------------------------");
		
		//#2
		Scanner input1=new Scanner(System.in);	
		System.out.println("Please enter a number");
		
		String num1=input.next();
		System.out.println(num1);
		
		System.out.println(num1+","+" please add a second number");
		
		String num2=input.next();
		System.out.println("Between "+ num1+" and "+num2+" please deterimine wether num1 or "
				+ "num2 is the largest");
		
		String product=input.next();
		System.out.println(num1+" is larger than "+ num2);

	}

}
