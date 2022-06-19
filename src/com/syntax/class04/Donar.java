package com.syntax.class04;

public class Donar {

	public static void main(String[] args) {
		
		//#2 Check if patient is eligible or not
		
		int donarAge= 22;
		int donarWeight= 180;
		
		if (donarAge > 18 & donarWeight >= 110) {
			System.out.println("The patient is eligable");
		}else if (donarAge < 18 & donarWeight < 110) {
			System.out.println("We cannot accept such a patient");
		}
		
	}

}
