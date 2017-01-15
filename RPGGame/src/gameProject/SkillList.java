package gameProject;

import java.util.ArrayList;
import java.util.Scanner;

public class SkillList {
	
	private ArrayList<Skill> skillList = new ArrayList<Skill>();
	private Scanner sc = new Scanner(System.in);
	private int option;
	
	public SkillList(){
		
	}
	
	public void printList(){
		System.out.println("\tName\tCurrent Level\tMaximum Level\tCurrent Experience\tMaximum Experience");
		for(int i = 0; i < skillList.size(); i++){
			System.out.println(i + ").\t" +
					skillList.get(i).getName() + ":\t" + 
					"Level:/t" +
					skillList.get(i).getCurrentLevel() + "/" +
					skillList.get(i).getMaximumLevel() + "\t" +
					"Experience:\t" +
					skillList.get(i).getCurrentExperience()+"/"+
					skillList.get(i).getMaximumExperience());
		}
		System.out.println("Hit enter to countine.");
		sc.nextLine();
	}
	
	public void inspectSkill(){
		printList();
		System.out.println("Select what skill you would like to inspect.");
		option = sc.nextInt() - 1;
		System.out.println(skillList.get(option).getName() + ": \n" + 
				skillList.get(option).getDescription());
		sc.nextLine();
		System.out.println("Hit enter to continue.");
		sc.nextLine();
		
	}
}
