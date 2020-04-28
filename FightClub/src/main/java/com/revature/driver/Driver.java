package com.revature.driver;

import com.revature.filestuff.FileStuff;
import com.revature.menu.Menu;
import com.revature.util.Roster;

public class Driver {

	public static void main(String[] args) {
//		Warrior mikey = new Warrior("Mikey", 200, 4);
//		Warrior steven = new Warrior("Steven", 150, 8);
//		System.out.println(Roster.warriorList.toString());
//		Fight fight = new Fight();
//		fight.fightTime(mikey, steven);
//		System.out.println(Roster.warriorList.toString());
		FileStuff.readWarriorFile();
		System.out.println(Roster.warriorList.toString());
		System.out.println("===============");
		Menu.startMenu();

	}

}
