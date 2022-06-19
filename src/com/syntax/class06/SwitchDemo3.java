package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		/*
		 * let's ask a user where he is from
		 * based on the country we will define food
		 */
		
		Scanner scan=new Scanner(System.in);
		String country, favoriteFoods;
		
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "mexico":
			favoriteFoods="tacos";
			break;
		case "canda":
			favoriteFoods="poutine";
			break;
		case "turkey":
			favoriteFoods="lahmacun";
			break;
		case "pakistan":
			favoriteFoods="pati chai";
			break;
		case "egypt":
			favoriteFoods="koshary";
			break;
		case "usa":
			favoriteFoods="burgers";
			break;
			default:
				favoriteFoods="unknown";
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFoods);

	}

}
