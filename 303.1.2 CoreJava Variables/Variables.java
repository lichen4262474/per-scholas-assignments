package com.perscholas.java_basics;

public class Variables {

	public static void main(String[] args) {
		question 1();
		question 2();
		question 3();
		question 4();
		question 5();
		question 6();
		question 7();
		question 8();
	}
	
	public static void question 1() {
		// assignment # 1
		int a = 5;
		int b = 6;
		int c;
		c = a + b;
		System.out.println(c);
	}
	public static void question 2() { 
		// assignment #2
		double d = 5d;
		double e = 6d;
		double f;
		f = d + e;
		System.out.println(f);
	}
	public static void question 3() { 
		// assignment # 3
		double g;
		g = a + d;
		System.out.println(g);
	}
	public static void question 4() { 
	// assignment # 4
		double h;
		h = e / d;
		System.out.println(h);
	}
	public static void question 5() { 
	// assignment # 5
		double i;
		i = e / d;
		System.out.println((int) i);
		}
	public static void question 6() {
		// assignment #6
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.println(q);
		q = y;
		System.out.println(q);
	}
	public static void question 7() { 
		// assignment #7
		final int J = 12;
		int k = 9 * J;
		System.out.println(k);
	}
	public static void question 8() { 
		// assignment #8
		float coffee = 3.2f;
		float tea = 2.3f;
		float hotChocholate = 4.2f;
		float subTotal;
		float totalSale;
		final float SALES_TAX = 0.08f;
		subTotal = 3 * coffee + 4 * tea + 2 * hotChocholate;
		totalSale = subTotal * (1 + SALES_TAX);
		System.out.printf("The totalsale is %.2f", totalSale);
	}
		/*
		 * int myFirstInt = 5; int mySecondInt = 6; int max = myFirstInt > mySecondInt ?
		 * myFirstInt : mySecondInt; System.out.println(max); String myString = "6"; int
		 * myInt = Integer.parseInt(myString); System.out.println(myInt);
		 */

}//close class
