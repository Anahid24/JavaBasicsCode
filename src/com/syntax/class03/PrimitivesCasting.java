package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
		//ctrl+space --> auto complete
		
		int i=100;
		double d=100;//widenign
		
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		long l=100987878987986l;
		//byte b=130;
		
		//Type mismatch: cannot convert from double to int
		//int x=99.99 erroe:cannot convert from double to int
		int x=(int)99.99;//narrowing
		System.out.println(x);
		
		//Type mismatch: cannot convert from int to byte
		//byte b=130 error: cannot convert from int to byte
		byte b=(byte)130;
		System.out.println(b);
		
		//type mismatch: cannot convert from double to float
		float f=10.99f;
		
		double dd=9.99;
		
		double price=100;

	}

}
