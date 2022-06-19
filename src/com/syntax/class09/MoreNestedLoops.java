package com.syntax.class09;

public class MoreNestedLoops {

	public static void main(String[] args) {
		
		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an
		 * hour and 2 digits for a minute. Example: 10:00 10:01 etc.
		 */
        //int hour, min;
		
		
		
		System.out.println(" - CLOCK - ");
		for (int hrs = 0; hrs <= 24; hrs++) {
			
			for (int min = 0; min <= 59; min++) {
			
				String time;
				
				if (hrs<10 && min<=10) {
					time="0"+hrs+":"+min;
				}else if (hrs<10 && min>10) {
					time="0"+hrs+":"+min;
				}else if (hrs>10 && min<10) {
					time=hrs+":"+"0"+min;	
				}else {
					time=hrs+":"+min;
				}
				System.out.println(time);
			}
		}
		System.out.println(" ---- CLOCK ANOTHER WAY ----");
		 
	    for(int a=0; a<=2; a++) {
	    	for(int b=0; b<=9; b++) {
	    		if(a==2 && b==4) {
	    			break;
	    		}
	    		for (int c=0;c<=5;c++) {
	    			for(int d=0; d<=9; d++) {
	    				System.out.println(a+""+b+":"+c+d);
	    			}
	    		}
	    	}
	    }
	  }
	}