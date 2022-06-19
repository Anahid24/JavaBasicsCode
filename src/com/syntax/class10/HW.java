package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		
		/* Create an array to store double values and print all elements use
		 * different loops
		 */
		
		double[]num= {2.99, 3,99, 4.99, 5};
		
		for (double x: num) {
			System.out.println(x+" ");
		}
		
		System.out.println();
		
		for(int i=0; i < num.length; i++) {
			System.out.println(num[i]+" ");
		}
		
		System.out.println();
		
		//Create an array of integers
		//and calculate the sum of all numbers
		
		int[] numbers= {10,222,3,4,5};
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
        }
		System.out.println("Sum of all elements = "+sum);
		
		sum=0;
		
		for(int n:numbers) {
			
			sum+=n;
		}
		System.out.println("Sum of all elements = "+sum);

	}

}
