package gameProject;
import java.util.*;

public class player
{
    private String name;
    private int currentHealth;
    private int MaxHealth;
    private int money;
    private int floor;
    private ArrayList<item> inventory;
    private int strength;
    private int defence;
    
    public player(String iD, int hp, int gold, int fl, int str, int def){
        currentHealth = hp;
        MaxHealth = hp;
        money = gold;
        name = iD;
        floor = fl;
        inventory = new ArrayList<item>();
        strength = str;
        defence = def;
    }

    public void setCurrentHealth(int x)
    {
        currentHealth = x;
    }
    
    public int getCurrentHealth(){
        return currentHealth;
    }
    
    public void setMaxHealth(int x)
    {
        MaxHealth = x;
    }
    
    public int getMaxHealth(){
        return MaxHealth;
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
    
    public void setInventory(ArrayList<item> inv){
        inventory = inv;
    }
    
    public ArrayList<item> getInventory(){
        return inventory;
    }
    
    public void addItem(item x){
        inventory.add(x);
    }
    
    public void removeItem(item x){
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
