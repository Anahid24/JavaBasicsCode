package com.syntax.class08;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<6; i++) {
			
		System.out.print(sum+" "); // 0 1 3 6 10
		sum+=i;
		//System.out.println(sum+" "); // 1 2 3 6 10 15
	    }
        System.out.println();
        System.out.print(sum);//15
        
        /*
         * write a program to find of all even and odd numbers 
         * from 1 to 70
         */
        System.out.println();
        //even
        int sum1=0;
        
        for(int i=1; i<=70; i++) {
        	if(i % 2 == 0) {
        		sum1 += i;
        	}
        }
        System.out.println("Sum of all even ="+ sum1);
        
        //odd
        System.out.println();
        int sum2=0;
		
		for (int i=1; i<=70; i++) {
			if (i%2 == 0) {
				sum2 +=i;
			}
		    }
		  System.out.println("Sum of odd number is "+sum2);
		  
		  System.out.println();
        
        //ANOTHER WAY
        
        int sumEven=0;
        int sumOdd=0;

        for (int i = 1; i <= 70; i++) {

        if (i % 2 == 0) {
        sumEven+=i;
        }else {
        sumOdd+=i;
        }
        }

        System.out.println("Sum even numbers is "+sumEven);
        System.out.println("Sum odd numbers is "+sumOdd);
        
        System.out.println();
        
        /*
         * declare a secrete number;
         * you want to ask user to guess your secret number
         * you code should keep asking to guess until user gets your secret number
         * Once user gets the secret number --> you got it
         */
        
        Scanner scan=new Scanner(System.in);
        int secreteNum=7183;
        
        System.out.println("Guess my secret number");
        secreteNum=scan.nextInt();
        
        while(secreteNum!=7183) {
        	System.out.println("Guess my secret number");
        	 secreteNum=scan.nextInt();
        } System.out.println("You got it!");
        
   }
}


