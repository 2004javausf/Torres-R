package com.revature.beans;
//packages are just very fancy folders. Namespace

/*
 * Naming Conventions
 * Classes and Projects: Pascal casing, Capitalize the first letter
 * 	of each word ex. ProjectMayhem
 * Methods and variables: Camel casing, ex. firstSecondThird
 * packages: lowercase and delimited by periods
 * Constants: ALL_CAPS typically delimited by underscores
 */
public class Human {
	/*
	 * Members of a class - couple of forms
	 * Instance variable - property of a specific object (human's name)
	 * Static variables - property of the class shared by all of it's
	 * 	instances
	 * Instance methods - behavior relative to a specific object
	 * Static methods - behavior relative to entire class
	 * Constructor - instantiates the class using the keyword "new"
	 * 
	 */
	private String name;
	private int age;
	private int weight;
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	//setters
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
}
