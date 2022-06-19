package com.syntax.class08;

public class ForLoopTask {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 100 in 1 line with space
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}

		 System.out.println();
        //Print numbers from 100 to 1
		 
		 for(int i=100; i>=1; i--) {
			 System.out.print(i+" ");
		 }

        System.out.println();
       //Print even numbers from 20 to 1 (2 ways)
        
        for(int i=20; i>=1;i-=2) {
        	System.out.print(i+" ");
        }

        System.out.println();
       //Print odd numbers between 20 and 50 (2 ways)
        
        for(int i=21; i<=50; i+=2) {
        	System.out.print(i+" ");
        }
        
  }
}
