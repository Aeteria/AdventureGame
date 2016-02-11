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
    private ArrayList<item> inventory;
    private item weapon;
    
    public enemy(String iD, int hp, int gold, item w){
        currentHealth = hp;
        money = gold;
        name = iD;
        inventory = new ArrayList<item>();
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
    
    public void setWeapon(item x){
        weapon = x;
    }
    
    public item getWeapon(){
        return weapon;
    }
    
}
