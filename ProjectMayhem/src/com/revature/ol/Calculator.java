package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		a=5;
		b=a;
		a=(int)b;
		System.out.println(b);
		System.out.println(b);
		add(add(5,4),6);
		add(3, 6);
		add(1.3, 4.5);
	}
	//parametric polymorphism
	static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}

	static double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
}
