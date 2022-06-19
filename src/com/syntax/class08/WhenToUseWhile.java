package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
		
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
