package com.revature.classtypes;

public class Shark extends Fish implements Hunt{

	@Override
	public void swim() {
		System.out.println("I'm swiming underwater and I'm terrifying");
		
	}

	@Override
	public void breathe() {
	System.out.println("I breathe underwater, meeeeeeeeeeegh");
		
	}
	
	@Override
	public void findPrey() {
		System.out.println("I ate fishes!");
	}

}
