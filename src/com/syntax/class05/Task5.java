package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 *  Create a Java program that will ask if user has a credit card or not. 
		 *  If you user does not have a credit card then offer them. 
		 *  If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
		 *  tell them to pay off immediately, otherwise you can tell them that they can spend more.
		 */
		Scanner scanner1=new Scanner(System.in);

		System.out.println("Do you have a credit card?");
		boolean creditCard=scanner1.nextBoolean();
		
		if(creditCard) {
			System.out.println("What is the balance of the card?");
			double balance = scanner1.nextDouble();
			if(balance>1000) {
				System.out.println("Pay off immeadiatly");
			}else {
				System.out.println("You can spend more");
			}
		}
	}
}
