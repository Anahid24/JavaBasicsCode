package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		// print numbers from 1 to 10;
		
		int num=1;
		while(num<=10) {
			//num++;
			System.out.print(num+" ");
			num++;
		}
		
		// print numbers from 1 to 10;
		System.out.println();
		
		int num1=0;
		while(num1>=10) {
			num++;
			System.out.print(num1+" ");

	    }
		
		// print numbers from 10 to 100
		System.out.println();
		
		int a=10;
		
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		//print numbers from 10 to 1:
		System.out.println();
		
		int b=10;
		
		while (b>=10) {
			System.out.print(b);
			b--;
		}
		
		//print numbers from 100 to 50:
		System.out.println();
		
		int c=100;
		
		while (c>=100) {
			System.out.println(c+" ");
			c--;
		}
		
		//print number from -1 to -10
		System.out.println();
		
		int d=-1;
		
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		
		// print numbers from 1 to 20 but only even numbers
		
		
		//1 way
		System.out.println();
		
		int e=0;
		
		while (e<=20) {
			System.out.print(e+" ");
			e+=2;
		}
		
		//2 way
		System.out.println();
		
		int f=1;
		
		while (f<=20) {
			if(f % 2 == 0) {
				System.out.print(f + " ");
			}
			f++;
		}

  }
}
