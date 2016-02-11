package gameProject;
import java.util.*;

public class game
{
    private Scanner sc;
    private int intOption;
    private String stringOption;
    private String buffer;
    private ArrayList<item> shopItems = new ArrayList<item>();
    private String[] monsterList = { "Goblin", "Ogre", "Demon", "Ghost", "Golem", "Vampire", "Werewolf", "Zombie"};
    private ArrayList<item> itemDrops = new ArrayList<item>();
    private item item2 = new item("Warhammer", 1, 999, 999, 0);
    private item item3 = new item("Battleaxe", 1, 999, 999, 0);
    private item item4 = new item("Dagger", 1, 999, 999, 0);
    private item item5 = new item("Greatsword", 1, 999, 999, 0);
    private item item6 = new item("Mace", 1, 999, 999, 0);
    private item item7 = new item("Sword", 1, 999, 999, 0);
    private item item8 = new item("War Axe", 1, 999, 999, 0);
    int playerDamage = 0;
    int monsterDamage = 0;

    public game(){
        sc = new Scanner(System.in);
        intOption = 0;
        stringOption = "";
        buffer = "";
        item item1 = new item("Godly Sword", 1, 999, 999, 0);
        shopItems.add(item1);
        itemDrops.add(item2);
        itemDrops.add(item3);
        itemDrops.add(item4);
        itemDrops.add(item5);
        itemDrops.add(item6);
        itemDrops.add(item7);
        itemDrops.add(item8);
    }

    public void goToShop(player x){
        System.out.println("Welcome to the Shop!");
        do{
            System.out.println("What would you like to do?");
            System.out.println("1.) Buy");
            System.out.println("2.) Sell");
            System.out.println("3.) Upgrade");
            System.out.println("4.) Go Back");
            intOption = sc.nextInt();
            buffer = sc.nextLine();
            if(intOption == 1){
                System.out.println("What would you like buy?");
                for(int i = 0; i < shopItems.size(); i++){
                    System.out.println(i + ".) " + shopItems.get(i).getName());
                }
                intOption = sc.nextInt();
                buffer = sc.nextLine();
                x.setMoney(x.getMoney() - shopItems.get(intOption).getValue());
                x.addItem(shopItems.get(intOption));
            }else if(intOption == 2){
                System.out.println("What would you like sell?");
                for(int i = 0; i < x.getInventory().size(); i++){
                    System.out.println(i + ".) " + x.getInventory().get(i).getName());
                }
                intOption = sc.nextInt();
                buffer = sc.nextLine();
                x.setMoney(x.getMoney() + x.getInventory().get(intOption).getValue());
                x.removeItem(x.getInventory().get(intOption));
            }else if(intOption == 3){
                System.out.println("Upgrading will increace base damage and max damage by 1 for 10 gold.");
                System.out.println("What would you like upgrade?");
                for(int i = 0; i < x.getInventory().size(); i++){
                    System.out.println(i+".) "+x.getInventory().get(i).getName());
                }
                intOption = sc.nextInt();
                buffer = sc.nextLine();
                x.setMoney(x.getMoney() - x.getInventory().get(intOption).getValue());
                x.getInventory().get(intOption).setName(x.getInventory().get(intOption).getName() + " + 1");
            }else if(intOption == 4){
                System.out.println("Have a nice day.");
                buffer = sc.nextLine();
            }
            System.out.print('\u000C');
        }while(intOption != 4);
    }
    
    public void fightMonsters(player x){
        enemy monster1 = new enemy(monsterList[(int)(Math.random()*monsterList.length)], x.getFloor()*5, x.getFloor()*2, itemDrops.get((int)(Math.random()*itemDrops.size())-1));
        do{
            System.out.println("You encountered " + monster1.getName() + ".");
            System.out.println("What do you want to do?");
            System.out.println("1.) Attack");
            System.out.println("2.) Use item");
            System.out.println("3.) Runaway");
            intOption = sc.nextInt();
            buffer = sc.nextLine();
            if(intOption == 1){
                playerDamage = monster1.getCurrentHealth() - x.getInventory().get(0).damageRange() + x.getStrength();
                monster1.setCurrentHealth(monster1.getCurrentHealth() - playerDamage);
                System.out.println(x.getName() + " did " + playerDamage + " damage.");
                System.out.println("The " + monster1.getName() + " has " + monster1.getCurrentHealth() + " health left.");
                monsterDamage = x.getCurrentHealth() - monster1.getWeapon().damageRange() + x.getDefence();
                x.setCurrentHealth(x.getCurrentHealth() - monsterDamage);
                System.out.println(monster1.getName() + " did " + monsterDamage + " damage.");
                System.out.println(x.getName() + " has " + x.getCurrentHealth() + " health left.");
                buffer = sc.nextLine();
            }
            if(intOption == 2){
                //no items implimaded yet
                monsterDamage = x.getCurrentHealth() - monster1.getWeapon().damageRange() + x.getDefence();
                x.setCurrentHealth(monsterDamage);
                System.out.println(monster1.getName() + " did " + monsterDamage + " damage.");
                System.out.println(x.getName() + " has " + x.getCurrentHealth() + " health left.");
                buffer = sc.nextLine();
            }
            if(intOption == 3){
                System.out.println("you flee from battle");
                buffer = sc.nextLine();
            }
            System.out.print('\u000C');
        }while(x.getCurrentHealth() > 0 && monster1.getCurrentHealth()> 0 || intOption == 3);
        x.setStrength(x.getStrength()+1);
        System.out.print('\u000C');
    }
    
    public void fightBoss(player x){
        boss monster1 = new boss(monsterList[(int)(Math.random()*monsterList.length)-1], x.getFloor()*5, x.getFloor()*2, itemDrops.get((int)(Math.random()*itemDrops.size())-1));
        do{
            System.out.println("You encountered " + monster1.getName() + ".");
            System.out.println("What do you want to do?");
            System.out.println("1.) Attack");
            System.out.println("2.) Use item");
            intOption = sc.nextInt();
            buffer = sc.nextLine();
            if(intOption == 1){
                playerDamage = x.getInventory().get(0).damageRange() + x.getStrength();
                monster1.setCurrentHealth(playerDamage);
                System.out.println(x.getName() + " did " + playerDamage + " damage.");
                int monsterhp = monster1.getCurrentHealth() - playerDamage;
                System.out.println("The " + monster1.getName() + " has " + monsterhp + " health left.");
                monsterDamage = monster1.getWeapon().damageRange() + x.getDefence();
                x.setCurrentHealth(monsterDamage);
                System.out.println(monster1.getName() + " did " + monsterDamage + " damage.");
                int playerhp = x.getCurrentHealth() - monsterDamage;
                System.out.println(x.getName() + " has " + playerhp + " health left.");
                buffer = sc.nextLine();
            }
            if(intOption == 2){
                //no items implimaded yet
                monsterDamage = x.getCurrentHealth() - monster1.getWeapon().damageRange() + x.getDefence();
                x.setCurrentHealth(monsterDamage);
                System.out.println(monster1.getName() + " did " + monsterDamage + " damage.");
                System.out.println(x.getName() + " has " + x.getCurrentHealth() + " health left.");
                buffer = sc.nextLine();
            }
            System.out.print('\u000C');
        }while(x.getCurrentHealth() > 0 && monster1.getCurrentHealth()> 0);
        x.setStrength(x.getStrength()+1);
        x.setFloor(x.getFloor()+1);
        System.out.print('\u000C');
    }
}
