package com.syntax.class05;

import java.util.Scanner;

public class GradeScoreHomeworkPart6 {

	public static void main(String[] args) {
		/* #5:
		 * 
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules:
		 *   if the average score >=90 → grade=A
		 *   if the average score >= 70 and <90 → grade=B
		 *   if the average score>=50 and <70 → grade=C
		 *   if the average score<50 → grade=F
		 */  
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter quiz scores");
		int quizScore=input.nextInt();
		System.out.println("Please enter mid term scores");
		int midtermScore=input.nextInt();
		System.out.println("Please enter final scores");
		int finalScore=input.nextInt();
		
		int average= (quizScore + midtermScore + finalScore);
		char grade;
		
		if (average >= 90) {
			System.out.println("Your grade is a A");;
		}else if (average >= 70 && average < 90) {
			System.out.println("Your grade is a B");
		}else if (average >= 50 && average < 70) {
			System.out.println("Your grade is a C");
		}else if (average < 50) {
			System.out.println("Your grade is a F");
		}

	}

}
