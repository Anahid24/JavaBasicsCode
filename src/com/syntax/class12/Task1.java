package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		/* Store username, password and confirm password from a user and check following requirements:
		 * 
		 *   1. Username and Password cannot be  empty, if so→ message="Username and Password cannot be empty".
		 *   2. Password should be minimum 8 characters, if less → message="Password is too short".
		 *   3. Password cannot contain username if so, → message="Password cannot contain username".
		 *   4. Password should match confirmed password, if not  → message=“Passwords do not match”.
		 *  
		 *  Only after all requirements met → message "Your username and password has been created"
		 */
		
		String userName="User";
		String password="pass12345678";
		String confirmPassword="pass12345678";
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if(password.length()<8){
			System.out.println("Password is too short");
		}else if(password.contains(userName)){
			System.out.println("Password cannot contain username");
		}else if(!confirmPassword.equals(password)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
		

	}

}
