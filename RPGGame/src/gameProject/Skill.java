package gameProject;

import java.util.Scanner;

public class Skill {
	
	private String name;
	private String description;
	private int trainablity;
	private int currentExperience;
	private int currentLevel;
	private int maximumExperience;
	private int maximumLevel;
	Scanner sc = new Scanner(System.in);

	public Skill(String name, String description, int trainability){
		this.name = name;
		this.description = description;
		this.trainablity = trainability;
		currentExperience = 0;
		currentLevel = 1;
		maximumLevel = 99;
		maximumExperience = currentLevel * 100 * trainability;
	}
	
	public void gainExp(int amount){
		if(currentExperience + amount < maximumExperience){
			currentExperience += amount;
		}else{
			skillUp(maximumExperience - (currentExperience + amount));
		}
	}
	
	public void skillUp(int amount){
		currentExperience = amount;
		currentLevel += 1;
		maximumExperience = currentLevel * 100 * trainablity;
		System.out.println("You have \"Skilled Up\" in \"" + name + ".");
		System.out.println("Hit enter to continue.");
		sc.nextLine();
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getCurrentLevel(){
		return currentLevel;
	}
	
	public void setCurrentLevel(int level){
		currentLevel = level;
	}
	
	public int getCurrentExperience(){
		return currentExperience;
	}
	
	public void setCurrentExperience(int experience){
		currentExperience = experience;
	}
	
	public int getMaximumExperience(){
		return maximumExperience;
	}
	
	public void setMaximumExperience(int experience){
		maximumExperience = experience;
	}
	
	public int getMaximumLevel(){
		return maximumLevel;
	}
	
	public void setMaximumLevel(int level){
		maximumLevel = level;
	}
}
