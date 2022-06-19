package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice='Y';
		String meaning;
		
		//variable and matching cases MUST BE of the same type
		
		switch(choice) {
		
		case'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
		}
		System.out.println(meaning);

	}

}
