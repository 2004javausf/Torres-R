package com.revature.recursion;

public class Fibby {
	
	/*
	 * Fibonacci Sequence
	 * 0,1,1,2,3,5,8,13,21,24,55...
	 * 
	 * Iterative
	 * 
	 * Recursive
	 * 	calling itself
	 */

	public static void main(String[] args) {
//		fibbyIterative(8);
		fibbyRecursive(10);
		

	}
	public static void fibbyIterative(int i) {
		//use a loop
		int current = 1;
		int previous = 0;
		int pp = 0;
		for (int j = 1; j < i; j++) {
			System.out.print(current + ", ");
			pp = previous;
			previous = current;
			current = pp + previous;			
		}
		System.out.println(current);
	}
	
	public static int fibbyRecursive(int i) {
		//recursion
		if (i == 0) {
			System.out.println(0);
			return 0;
		}
		else if(i == 1 || i == 2) {
			System.out.println(1);
			return 1;
		}
		
		System.out.println(fibbyRecursive(i - 2) + fibbyRecursive(i - 1));
		return fibbyRecursive(i - 2) + fibbyRecursive(i - 1);
	}
}
