package gameProject;
import java.util.*;
/**
 * Michael Ngo
 * 12/17/15
 */
public class item
{
    private String name;
    private int value;
    private int baseDamage;
    private int maxDamage;
    private int heal;
    
    public item(String id, int cost, int base, int max, int life){
        name = id;
        value = cost;
        baseDamage = base;
        maxDamage = max;
        heal = life;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String x){
        name = x;
    }
    
    public int getValue(){
        return value;
    }
    
    public int getBaseDamage(){
        return baseDamage;
    }
    
    public void setBaseDamage(int x){
        baseDamage = x;
    }
    
    public int getMaxDamage(){
        return maxDamage;
    }
    
    public void setMaxDamage(int x){
        maxDamage = x;
    }
    
    public int damageRange(){
        int range = (maxDamage - baseDamage) + 1;     
        return (int)(Math.random() * range) + baseDamage;
    }
    
    public int getHeal(){
        return heal;
    }
    
    public void setHeal(int x){
        heal = x;
    }
    
}
