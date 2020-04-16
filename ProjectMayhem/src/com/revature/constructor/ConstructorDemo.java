package com.revature.constructor;

public class ConstructorDemo extends D{

	/*Constructors
	 * how we instantiate an object
	 * No return type but does return that object that it created
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("In Main");
		C c=new C();

	}

}

class A{
	static {System.out.println("A's static code block");}
	{System.out.println("A's instance code block");}
	A(){
		//B b= new B(); this beaks things
		System.out.println("Inside A's constructor");
	}
}

class B extends A{
	B(){
		//A a=new A(); does A twice
		System.out.println("Inside B's constructor");
	}
}

class C extends B{
	static {System.out.println("C's static code block");}
	C(){
		System.out.println("Inside C's constructor");
	}
}

class D {
	static {System.out.println("D's static code block");}
	D() {
		System.out.println("inside D's");
	}
}