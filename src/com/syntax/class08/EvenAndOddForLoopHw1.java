package com.syntax.class08;

import java.util.Scanner;

public class EvenAndOddForLoopHw1 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 */
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please input two numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		System.out.println();
		System.out.println(" ----------- SUM OF EVEN NUM ------------ ");
		System.out.println();
		
		// Sum of even numbers from 1 to 6
          int sum1=0;
        
          for(int i=1; i<=6; i++) {
        	if(i % 2 == 0) {
        		sum1 += i;
        	}
        }
			System.out.println("The sum of the even numbers is "+ sum1);
		
		System.out.println();
		System.out.println(" ----------- SUM OF ODD NUM ------------ ");
		System.out.println();
		
		// Sum of odd numbers from 1 to 6
		
         int sum2=0;
		
		for (int i=1; i<=6; i++) {
			if (i % 2 != 0) {
				sum2 += i;
			}
		}
			System.out.println("The sum of the odd numbers is "+ sum2);

	}

}
