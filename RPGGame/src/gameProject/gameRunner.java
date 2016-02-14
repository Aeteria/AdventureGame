package gameProject;
import java.util.*;


public class gameRunner
{
    private static Scanner sc = new Scanner(System.in);
    private static int intOption;
    private static String stringOption;
    private static String buffer;
    private static game game1;
    private static player player1;
    
    public static void main(String args[]){
        game1 = new game();
        System.out.println("Welcome the World of Arcadia!");
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What difficulty?");
        System.out.println("1.) Easy");
        System.out.println("2.) Medium");
        System.out.println("3.) Hard");
        String stringOption = sc.nextLine();
        if(stringOption.equals("1") || stringOption.equals("easy") || stringOption.equals("Easy") ){
        	player1 = new player(name, 500, 500, 1, 5, 5);
        }
        if(stringOption.equals("1") || stringOption.equals("medium") || stringOption.equals("Medium") ){
        	player1 = new player(name, 300, 300, 1, 3, 3);
        }
        if(stringOption.equals("1") || stringOption.equals("hard") || stringOption.equals("Hard") ){
        	player1 = new player(name, 100, 100, 1, 1, 1);
        }
        //int health = 100;
        //System.out.println("You have 100 health.");
        
        do{
            System.out.println("What would you like to do?");
            System.out.println("1.)Choose Starting Weapon and Spell");
            System.out.println("2.)Start Game");
            intOption = sc.nextInt();
            buffer = sc.nextLine();
            if(intOption == 1){
                game1.goToStarttingShop(player1);
            }
        }while(intOption != 2);
        
        do{
        	System.out.println("What would you like to do?");
            System.out.println("1.) Go To Shop");
            System.out.println("2.) Fight Monsters");
            System.out.println("2.) Fight Boss");
            intOption = sc.nextInt();
            buffer = sc.nextLine();
            if(intOption == 1){
                game1.goToShop(player1);
            }
            if(intOption == 2){
                game1.fightMonsters(player1);
            }
            if(intOption == 3){
                game1.fightBoss(player1);
            }
        }while(player1.getCurrentHealth() > 0);
        System.out.println("You have died, you must restart.");
    }
}
