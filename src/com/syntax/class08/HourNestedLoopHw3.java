package com.syntax.class08;

public class HourNestedLoopHw3 {

	public static void main(String[] args) {
		
		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an hour and 2 digits for 
		 * a minute.
		 * Example:
		 * 10:00
		 * 
		 * 10:01
		 * 
		 * 10:02
		 * 
		 * …..etc
		 * 
		 * 10:59
		 * 
		 * 11:00
		 * 
		 * ……etc
		 * */
		
		for (int hour = 0; hour <= 24; hour++) {
			for (int min = 0; min <= 59; min++) {
				if(hour < 10 && min < 10) {
		System.out.println("0"+hour+":"+"0"+min);
				} else if (hour>= 10 && min >= 10){
					System.out.println(hour +":"+ min);
				}
      	}

      }
	}
}
