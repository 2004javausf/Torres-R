package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
	static Fight fight = new Fight();
	
	static Scanner scan = new Scanner(System.in);
	public static void startMenu() {
		System.out.println("Welcome to the game");
		System.out.println("Please enter a choice");
		System.out.println("[c]reate a new warrior");
		System.out.println("[f]ight!");
		System.out.println("[q]uit the game");
		String choice = scan.nextLine();
		switch(choice.toLowerCase()) {
			case "c":
				createMenu();
				break;
			case "f":
				fightMenu();
				break;
			case "q":
				System.out.println("BYE");
				break;
			default:
				System.out.println("Try again nerd");
				startMenu();
				break;
		}
			
	}
	
	
	public static void createMenu() {
		System.out.println("Create a new warrior!");
		System.out.println("Please enter a name for your warrior");
		String warriorName =  scan.nextLine();
		System.out.println("Please enter your warrior's HP");
		int warriorHp = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter your warrior's attack power");
		int warriorAttackPower = Integer.parseInt(scan.nextLine());
		Warrior a = new Warrior(warriorName, warriorHp, warriorAttackPower);
		LogThis.LogIt("info",  a.getName() + " was created");
		System.out.println(Roster.warriorList.toString());
		
		System.out.println("Would you like to make a new warrior? (y/n)");
		String choice = scan.nextLine();
		if(choice.equalsIgnoreCase("y")) {
			createMenu();
		}else if(choice.equalsIgnoreCase("n")) {
			startMenu();
		}else {
			System.out.println("Too bad, you're going to the Start Menu");
			startMenu();
		}
		
	}
	
	public static void fightMenu() {
		System.out.println("Enter the name of your first Warrior");
		String first = scan.nextLine();
		Warrior a = Roster.findWarriorByName(first);
		System.out.println("Enter the name of your second Warrior");
		String second = scan.nextLine();
		Warrior b = Roster.findWarriorByName(second);
		System.out.println("LET THE BATTLE BEGIN!");
		fight.fightTime(a, b);
		LogThis.LogIt("info", a.getName() + " just punched " + b.getName()
		+ " and inflicted " + a.getAttackPower() + " points of damage");
		System.out.println(a.getName() + " just punched " + b.getName()
		+ " and inflicted " + a.getAttackPower() + " points of damage");
		System.out.println(b.getName() + "'s HP is now " + b.getHp());
	}

}
