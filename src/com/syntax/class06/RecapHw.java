package com.syntax.class06;

import java.util.Scanner;

public class RecapHw {

	public static void main(String[] args) {
		
		boolean checkboxSelected=false;
		
		if(!checkboxSelected) {
			System.out.println("Click on checkbox");
		}
		
		System.out.println("---------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of worked years");
		int years = scan.nextInt();
		if (years >= 5) {
			System.out.println("You are eligble for bonus");
			System.out.println("Please enter your annual salary");
			int wage = scan.nextInt();
			if (wage > 50000) {
				System.out.println("You get a 5000 bonus");
			} else if (wage <= 50000) {
				System.out.println("You get a 3000 bonus");
			}
		} else {
			System.out.println("You don't get any bonus");
		}
		
		System.out.println("----------------------------");
		
		Scanner input=new Scanner (System.in);
		System.out.println("Current time");
		int time=input.nextInt();
		if (time>=1 &&time<= 11) {
			System.out.println("Morning");
		}else if (time>=12 && time<=15) {
			System.out.println("Afternoon");
		}else if (time>=16 && time<=20) {
			System.out.println("Evening");
		}else if (time >= 21 && time <= 24){
			System.out.println("Night");
		}else {
			System.out.println("Invalid time given");
		}
		System.out.println("-----------------------------------------");
        Scanner inp=new Scanner (System.in);
		
		System.out.println("please enter your birth month");
		String month=inp.next();
		
		if (month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
			System.out.println("You were born is season Spring");
		
		} else if (month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			System.out.println("You were born is season Summer");
		
		} else if (month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			System.out.println("You were born is season Autumn/Fall");
		
		} else if (month.equalsIgnoreCase("December")|| month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			System.out.println("You were born is season Winter");
		}
		
		System.out.println("-------------------------------------");
		
		Scanner scan1= new Scanner(System.in); 
		System.out.println("Please enter the quiz score ");
		double averageScore = 0;
		averageScore += scan1.nextDouble();
		System.out.println("Please enter the mid-term score ");
		averageScore += scan1.nextDouble();
		System.out.println("Please enter the final score ");
		averageScore += scan1.nextDouble();
		averageScore /= 3;
		if (averageScore >= 90) {
			System.out.println("Grade = A");
		} else if (averageScore >= 70 && averageScore < 90) {
			System.out.println("Grade = B");
		} else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("Grade = C");
		} else if (averageScore < 50) {
			System.out.println("Grade = F");
	}
		
		System.out.println("------------------------");
		
		Scanner scan3= new Scanner(System.in);
		System.out.println("Quiz Score?");
		double Quiz=scan3.nextDouble();
		System.out.println("Mid Term Score?");
		double Term=scan3.nextDouble();
		System.out.println("Final Score?");
		double Final=scan3.nextDouble();
		
		double Average=((Quiz+Term+Final)/3);
		
		if(Average>=90) {
			System.out.println("Your grade is A");
			
		}else if(Average>=70 && Average<=90) {
			System.out.println("Your grade is B");
			
		}else if(Average>=50 && Average<=70) {
			System.out.println("Your grade is C");
			
		}else if(Average<50){
			System.out.println("Your grade is F");

        }
	}
}


