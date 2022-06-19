package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * if their is no traffic --> I will reach work on time
		 */
		
		boolean traffic=true;
		
		if(!traffic) {
			System.out.println("I will reach work on time");
		}
		
		String name="Emre";
		
		if (!name.equals("Emre")) {
			System.out.println("You are not Emre, and I need Emre");
		}

	}

}
