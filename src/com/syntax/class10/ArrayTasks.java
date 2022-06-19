package com.syntax.class10;

public class ArrayTasks {

	public static void main(String[] args) {
		
		//1) From an array of integer elements find the largest number.
		
		int[] largestNum= {2, 10, 27, 18, 38, 41, 31, 10, 7};
		int n=largestNum[0];
		
		for (int i=1; i<largestNum.length; i++) {
			if(largestNum[i]>n) {
				n=largestNum[i];
			}
			System.out.println("The largest element is "+ n);
		}
		
		n=largestNum[0];
		
		for(int l:largestNum) {
			if(l>n) {
				n=l;
			}
		}
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
        //2) Create an array to store char values and then print those in reverse order
		
		char[] letters= {'a','b','c','d'};
		
		for(int i=letters.length-1; i >= 0; i--) {
			
			System.out.println(letters[i]+" ");
		}
		
		
		

	}

}
