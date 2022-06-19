package com.syntax.class06;

import java.util.Scanner;

public class SwitchCountryAndLangHomeworkPart1 {

	public static void main(String[] args) {
		
		/* #1:
		 * 
		 * Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Where are you from?");
		
		String country=input.nextLine();
		String language;
		
		if(country.equals("USA")) {
			language="English";
		}else if (country.equals("France")) {
			language="French";
		}else if (country.equals("Armenia")) {
			language="Armenian";
		}else if (country.equals("Spain")) {
			language="Spanish";
		}else if (country.equals("Portugal")) {
			language="Portuguese";
		}else {
			language="Unknown";
		}
		System.out.println("Your language is "+ language);
		
		System.out.println("-------------------------");
		
		switch (country) {
		case "USA":
			language="English";
			break;
			
		case "France":
			language="French";
			break;
			
		case "Armenia":
			language="Armenian";
			break;
		case "Spain":
			language="Spanish";
			break;
		case "Portugal":
			language="Portuguese";
			break;
		default:
			language="Unknown";
		}
		System.out.println(language);

	}

}
