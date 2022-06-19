package com.syntax.class08;

import java.util.Scanner;

public class ShoppingForLoopHw2 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. Whenever a user done with payments 
		 * program should say “Thank you for shopping!”
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the item you would like to purchase");
		String item=input.nextLine();
		System.out.println("How much is the price?");
		int price=input.nextInt();
		System.out.println("How much is the payment?");
		int pay=input.nextInt();
		int totalCharge=0;
		int extraPay=0;
		int change=0;
		
		if (pay > price) {
			totalCharge=pay-price;
			System.out.println("You overpayed the item, here is your change"+ change);
		} else if (pay < price) {
			totalCharge=pay+price;
			System.out.println("You have not payed enough, please pay "+ extraPay);
		} else if (pay == price) {
			System.out.println("You have payed enough for your item, thank you for shopping!");
		}
		System.out.println("You have $"+totalCharge+" remaining");
		

	}

}
