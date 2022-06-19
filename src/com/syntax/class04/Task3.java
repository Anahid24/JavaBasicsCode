package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {
		
		//#1
		
		boolean diploma=true;
		double gpa= 4.0;
		
		if (diploma=true) {
			System.out.println("Congradualtions");
		}else {
			System.out.println("You need to get a degree");
		}
		if (gpa>=3.5) {
			System.out.println("You are eligble for scholarship");
		}else if (gpa>3.5){
			System.out.println("You should have studied harder");
		}
		System.out.println("--------------------------------");
		//2
		double mortgageRate= 2.7;
		int mortgagePrice= 3504;
		
		if (mortgageRate>4.5) {
			System.out.println("The user will not buy the house");
		}else if (mortgageRate<4.5) {
			System.out.println("The user will buy the house");
		}
		if (mortgagePrice>5000) {
			System.out.println("The user will take a loan");
		}else if (mortgagePrice<50000){
			System.out.println("The user will pay with cash");
		}

	}

}
