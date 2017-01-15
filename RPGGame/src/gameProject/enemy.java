package gameProject;
import java.util.*;
/**
 * Michael Ngo
 * 12/17/15
 */
public class enemy
{
    private String name;
    private int currentHealth;
    private int money;
    private ArrayList<Item> inventory;
    private Item weapon;
    
    public enemy(String iD, int hp, int gold, Item w){
        currentHealth = hp;
        money = gold;
        name = iD;
        inventory = new ArrayList<Item>();
        weapon = w;
    }

    public void setCurrentHealth(int x)
    {
        currentHealth = x;
    }
    
    public int getCurrentHealth(){
        return currentHealth;
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
    
    public void setWeapon(Item x){
        weapon = x;
    }
    
    public Item getWeapon(){
        return weapon;
    }
    
}
