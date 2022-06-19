package com.syntax.class02;

public class HomeworkAssignment {

	public static void main(String[] args) {
		
	//1)
		
	int num1= 84;
	int num2= 53;
		
	int sum, sub, mult, div;
		
	sum=num1+num2;
	System.out.println("The addion of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		
	sub=num1-num2;
	System.out.println("The subtraction of 2 numbers "+num1+" and"+num2+" is equal to "+sub);
		
	mult=num1*num2;
	System.out.println("The multipication of 2 numbers "+num1+" and"+num2+" is equal to "+mult);
		
	div=num1/num2;
	System.out.println("The division of 2 numbers "+num1+" and"+num2+" is equal to "+ div);
		
	System.out.println("-----------------------------------------------------");
		
	//2
		
	double box1= 3.9;
	double box2= Math.sqrt(box1);
	System.out.println("The square root of the "+box1+" is "+box2);
		
	System.out.println("-----------------------------------------------------");
		
	//3)
		
	int w= 5;
	int h= 8;
	int p= 2*(h+w);
	int a= w*h;
		
	System.out.println("The perimeter of a rectancle with width "+w+" and hight "+h+" is equal to "+p+" and the area ");
	System.out.println("is "+a);		
	}

}
