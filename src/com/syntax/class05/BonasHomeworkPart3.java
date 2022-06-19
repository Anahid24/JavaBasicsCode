package com.syntax.class05;

import java.util.Scanner;

public class BonasHomeworkPart3 {

	public static void main(String[] args) {
		
		/* #3:
		 * 
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many years have you worked?");
		int yearsWorked=input.nextInt();
		
		if (yearsWorked >= 5) {
			System.out.println("Congradualations you are eligible for a bonas!");
		}else {
			System.out.println("You are not eligible for a bonas");
		}
		System.out.println("What is your annual salary?");
		int salary=input.nextInt();
		
		if (salary > 50000) {
			System.out.println("You will recive a bonas of $50,000");
		}else {
			System.out.println("You will recive a bonas of $3,000");
		}

	}

}
