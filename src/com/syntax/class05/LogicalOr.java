package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/*
		 * Monday and Friday --> No class
		 * Tuesday and Wednesday --> Manual Testing
		 * Thursday --> Review class
		 * Saturday and Sunday --> Java
		 */
		
		String day="Monday";
		
		if (day.equals("Monday")||day.equals("Friday")){
			System.out.println("I have no class");
		}else if (day.equals("Tuesday")||day.equals("Wednesdayy")) {
			System.out.println("I have Manual Testing class");
		}else if (day.equals("Thursday")) {
			System.out.println("I have Reveiw class");
		}else if (day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("I have Java class");
		}

	}

}
