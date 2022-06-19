package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		
		//create 2d array of states
		/*
		 * 1 array -> NY --> all cities of NY state
		 * 2 array -> CA --> all cities of CA state
		 * 3 array -> FL --> all cities of FL state
		 * 4 array -> VA --> all cities of VA state
		 */
		
		String[][]usa= {
				
				   //0         //1        //2
				{"New York", "Albany", "Buffalo"},//0
				   //0              //1            //2         //3          //4 
				{"Los Angeles", "San Fransico", "San Jose", "San Diego", "Redding"},//1
				   //0       //1         //2        //3
				{"Miami", "Orlando", "Niceville", "Tampa"},//2
				   //0        //1         //2
				{"McLean", "Richmond", "Leesburg"}//3
		};
		
		System.out.println(usa[1][2]);//San Jose
		System.out.println("I want to go to "+usa[2][0]);//Miami
		
		System.out.println("Total # of 1D arrays in usa = "+usa.length);//4
		
		//I want to see how many element inside my first array
		int elem1array=usa[0].length;
		System.out.println("# of elements in 1 array = "+elem1array);//3
		
		//I want to see how many element inside my 2 array
		int elem2array=usa[1].length;
		System.out.println("# of elements in 2 array = "+elem2array);//5

	}

}
