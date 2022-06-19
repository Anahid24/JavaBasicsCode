package com.syntax.class05;

import java.util.Scanner;

public class LoanSpecialistHomeworkPart1 {

	public static void main(String[] args) {

		/* #1:
		 * 
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money 
		 * otherwise you would reject the client.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("What is the amount needed?");
		int loan=input.nextInt();
		
		if (loan <= 200000) {
			System.out.println("Lend money to user");
		}else {
			System.out.println("Reject the client");
		}

	}

}
