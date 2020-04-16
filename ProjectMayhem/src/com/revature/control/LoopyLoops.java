package com.revature.control;

public class LoopyLoops {
/* If statement
 * for decision making
 * providing multiple paths of execution
 * 
 * if(<contitional>){
 * 		*<what to do if true>
 * 		*else if(<second conditional>){
 * 		*<what to do if 2nd conditional is true>
 * 		* } else{
 * 		*<what to do if false>
 * 		* }
 * 
 * 		* Switch cases
 * 		* provides multiple paths of execution based on some value
 * 		* the "switch" is based on an integer numeric, a string, a char,
 * 		*	a boolean, or enum.
 */
	static String color;
	public static void whatColor(String color) {
		switch (color) {
			case "green":
				System.out.println("Color is green");
				break;
			case "purple":
				System.out.println("Color is purple");
				break;
			case "crimson":
				System.out.println("Color is crimson");
				break;
			default:
				System.out.println("You chose... poorly");
		}
		
		
	}
	
	/*For Loops
	 * 	for(a;b;c){do something}
	 * 	a is variable declaration (counter)
	 * 	b is the condition that controls how far the loop will go
	 * 	c is the incrementor/decrementor
	 */
	
	public static void forLoopFunness (int p) {
		for(int i=p; i>0;i--) {
			//break and continue
			if(i==0) {
				//break
				continue;
			}
			System.out.println(i);
		}
	}
	/*Enhanced for loop aka for each
	 * for (x:<Array or Collection>)(do things)
	 * good for moving through collection, arrays and other iterables
	 * more CPU efficient
	 * no issues w/ index out of bounds - not size dependent
	 * good for access elements in one collection
	 * bad for adding and removing
	 */
	static int [] myArray= {11,33,44,5,77,22,66,243};
	public static void forEachFun(int [] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	/*While Loops
	 * while(<condition>){<do something.}
	 * 
	 * do while
	 * do {<do something>} while (<condition>)
	 */
	public static void wileyWhile(int i) {
		while(i++<10) {
			System.out.println("boring");
			//i++;
		}
	}
	public static void doWileyWhile(int i) {
		do {
			System.out.println("not so boring");
			i++;
		}
		while(1<10);
	}
	
	public static void main(String[] args) {
		//whatColor("");
		//forLoopFunness(100);
		//forEachFun(myArray);
		//wileyWhile(11);
		doWileyWhile(7);
	}

}
/*Conditionals
*Logical Operators
*< > <= >= != ==
*OR
*a|b - bit wise
*a||b - short circuit OR If a is true, return true w/o b
*AND
*a&b - bit wise
*a&&b checks both and evaluates true if both are true
*EQUALS
*==
*compare values of primitives
*compare the reference for objects, NOT THE CONTENTS
*!= is good for checking nulls
*.equals()
*method inherited Object
*All reference types have it
*looking at content
*
*/