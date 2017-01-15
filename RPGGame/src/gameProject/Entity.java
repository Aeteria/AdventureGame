package gameProject;

import java.util.ArrayList;

public class Entity {

	private String name;
    private int currentHealth;
    private int maximumHealth;
    private int money;
    private int floor;
    private ArrayList<Item> inventory;
    private int strength;
    private int defence;

    public Entity(String iD, int hp, int gold, int fl, int str, int def){
    	currentHealth = hp;
    	maximumHealth = hp;
        money = gold;
        name = iD;
        floor = fl;
        inventory = new ArrayList<Item>();
        strength = str;
        defence = def;
    }
    
    public void setCurrentHealth(int x){
        currentHealth = x;
    }
    
    public int getCurrentHealth(){
        return currentHealth;
    }
    
    public void setMaximumHealth(int x)
    {
    	maximumHealth = x;
    }
    
    public int getMaximumHealth(){
        return maximumHealth;
    }
    
    public void setMoney(int x){
        money = x;
    }
    
    public int getMoney(){
        return money;
    }
    
    public void setName(String x){
        name = x;
    }
    
    public String getName(){
        return name;
    }
    
    public void setInventory(ArrayList<Item> inv){
        inventory = inv;
    }
    
    public ArrayList<Item> getInventory(){
        return inventory;
    }
    
    public void addItem(Item x){
        inventory.add(x);
    }
    
    public void removeItem(Item x){
        inventory.remove(x);
    }
    
    public void setFloor(int x){
        floor = x;
    }
    
    public int getFloor(){
        return floor;
    }
    
    public void setStrength(int x){
        strength = x;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void setDefence(int x){
        strength = x;
    }
    
    public int getDefence(){
        return strength;
    }
    
}
