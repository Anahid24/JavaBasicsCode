package com.syntax.class07;

import java.util.Scanner;

public class HWCalculatorIf {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int firstNum=input.nextInt();
		System.out.println("Please enter second number");
		int secondNum=input.nextInt();
		System.out.println("Use the operators: +,-,*,/");
		char operator=input.next().charAt(0);
		if (operator == '+') {
			int sum=firstNum+secondNum;
			System.out.println("The sum of two numbers is "+sum);
		}else if (operator == '-') {
			int sub=firstNum-secondNum;
			System.out.println("The sub of two numbers is "+sub);
		}else if (operator == '*') {
			int mult=firstNum*secondNum;
			System.out.println("The multipication of two numbers is "+mult);
		}else if (operator == '/') {
			int div=firstNum/secondNum;
			System.out.println("The division of two numbers is "+div);
		}else {
			System.out.println("Invalid");
		}

	}

}
