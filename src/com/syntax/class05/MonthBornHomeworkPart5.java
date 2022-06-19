package com.syntax.class05;

import java.util.Scanner;

public class MonthBornHomeworkPart5 {

	public static void main(String[] args) {
		/* #5:
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
		 * Example: 
		 * if user is born in March, April, May → season =“Spring”
		 * if user is born in June, July, August → season =“Summer” etc …
		 * At the end of the program we should see output as “You were born is season ______“.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month=input.next();
		
		if (month.equals("March")||month.equals("April")||month.equals("May")) {
			System.out.println("You were born in season Spring");
		}else if (month.equals("June")||month.equals("July")||month.equals("August")) {
			System.out.println("You were born in the season of Summer");
		}else if (month.equals("September")||month.equals("October")||month.equals("November")) {
			System.out.println("You were born in the season of Fall");
		} else if (month.equals("December")||month.equals("January")||month.equals("Febuary")) {
			System.out.println("You were born in the seaon of Winter");
		}

	}

}
