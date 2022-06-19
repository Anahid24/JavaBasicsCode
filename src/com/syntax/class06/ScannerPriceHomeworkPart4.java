package com.syntax.class06;

import java.util.Scanner;

public class ScannerPriceHomeworkPart4 {

	public static void main(String[] args) {
		
		/* #4:
		 * 
		 * Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale --> you are not going shopping
		 * if there is a sale ask user which item they want to buy and it's price
		 * Based on the price of the item after the discount, discount rule:
		 *  if price is less than $20 --> apply $10
		 *  if price is between $20 & $100 --> apply $20
		 *  if price is between $100 & $500 --> apply $40
		 *  otherwise apply $50 discount
		 * Your program should print out "After discount__the price of the item reduces form __ to __" 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale?");
		boolean sale=input.nextBoolean();
		
		if (!sale) {
			System.out.println("You are not going shoppinng");
		}else {
			System.out.println("Which item do you want to buy and enter it's price");
			String item=input.next();
			double price=input.nextDouble();
			double discountedPrice;
			String statement;
			
			if (price<20) {
				discountedPrice=price*0.9;
				statement="After discount 10%, the price of the item reduces from "+price+" to "+discountedPrice;
			}else if (price>=21 && price<=100) {
				discountedPrice=price*0.8;
				statement="After discount 20%, the price of the item reduces from "+price+" to "+discountedPrice;
			}else if (price>=101 && price<=500) {
				discountedPrice=price*0.7;
				statement="After discount 30%, the price of the item reduces from "+price+" to "+discountedPrice;
			}else {
				discountedPrice=price*0.5;
				statement="After discount 50%, the price of the item reduces from "+price+" to "+discountedPrice;
			}
			System.out.println(statement);
		}
	}

}
