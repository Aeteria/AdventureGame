package gameProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	private ArrayList<Item> inventory = new ArrayList<Item>();
	private Scanner sc = new Scanner(System.in);
	private int option;
	
	public Inventory(){
		
	}
	
	public void printList(){
		System.out.println("#\tName\tBase Damage\tMaximum Damage\tHeal\tValue");
		for(int i = 0; i < inventory.size(); i++){
			System.out.println(i + ").\t" +
					inventory.get(i).getName() + ":\t" + 
					"Level:/t");
		}
		System.out.println("Hit enter to countine.");
		sc.nextLine();
	}
	
}