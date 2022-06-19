package com.syntax.class06;

import java.util.Scanner;

public class SwitchGradeHomeworkPart2 {

	public static void main(String[] args) {
		
		/* #2:
		 * 
		 * Allow user to enter grade (A, B, or C, etc.) and then provide explanation
		 * A-Excellent, B-Good, c- Average, D-Bad, any other grade --> Not Acceptable.
		 * At the end, your program should print which grade was entered by a user with explanation
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=input.next().charAt(0);
		String explanation;
		
		switch (grade) {
		case 'A':
			explanation="Exellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		default:
			explanation="Not Acceptable";
		}
		System.out.println("Your grade is "+grade+", that means "+explanation);

	}

}
