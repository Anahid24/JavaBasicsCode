package com.syntax.class12;

public class StringDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= new String("Oleg"); //proper way of creating an object from a class
		
		String name2="Oleg"; //its same as String name= new String("Oleg");
		//All the classes in java can be treated as data types
		//if a class is present inside the same package or if class to java.lan package
		
		System.out.println(name.length());
		name2="Zameer";
		System.out.println(name2.length());
		
		String captain="Naveed";
		System.out.println(captain.toLowerCase());
		captain="I love Java";
		System.out.println(captain.toUpperCase());
	}

}
