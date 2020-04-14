package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single line comment
	/*
	 * multi
	 * line
	 * comment
	 */
	/*
	 * Why Java?
	 * "WORA" principle
	 * 		"Write one, Run anywhere"
	 * OOP
	 * Widespread use
	 * Great Documentation!
	 * Oracle
	 * 	Sun Microsystems used to own it...
	 * version 1.8 "Java 8"
	 * 
	 * 3 common acronyms- JDK, JRE, JVM
	 * 	JVM - Java Virtual Machine
	 * 		converts compiled Java code into machine 
	 * 		code that your processor can understand
	 * 		Provides portability
	 * 	JRE - Java Runtime Environment
	 * 		JVM + Libraries
	 * 		Everything that we need to run Java
	 * 	JDK - Java Development Kit
	 * 		Contains the JVM + JRE
	 * 		Compiler, etc...
	 * 		Everything we need to write Java
	 * Object Oriented Programming
	 * 	Java is OOP
	 * 	unit of programmability is the object
	 * 	Objects have states and behavior
	 * 	State - aka fields, attributes, variables, etc.
	 * 	Behavior - methods
	 * 	Classes - blueprint or template of an object
	 * 
	 */
	public static void main(String[] args) {
		/* public - access modifier, everything can access it
		 * static - do not need to instantiate to use/belongs
		 * 	to the class
		 * void - does not return anything
		 * String [] args - parameters used for this method
		 * 
		 */
		System.out.println("Roll Tide");
		Human h= new Human();
		System.out.println("h");
		h.setName("Peter");
		h.setAge(37);
		h.setWeight(390);
		System.out.println(h.getName());
	}
}
