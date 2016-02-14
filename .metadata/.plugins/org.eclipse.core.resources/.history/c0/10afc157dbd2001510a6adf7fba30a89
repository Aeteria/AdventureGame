package gameProject;
import java.util.*;


public class gameRunner
{
    private static Scanner sc = new Scanner(System.in);
    private static int intOption;
    private static String stringOption;
    private static String buffer;
    private static game game1;
    
    public static void main(String args[]){
        game1 = new game();
        System.out.println("Welcome the World of Arcadia!");
        System.out.println("What is your name?");
        String name = sc.nextLine();
        int health = 100;
        System.out.println("You have 100 health.");
        
        player player1 = new player(name, health, 100, 1, 1, 1);
        do{
            System.out.println("What would you like to do?");
            System.out.println("1.)Choose Starting Weapon");
            System.out.println("2.)Choose Starting Spell");
            System.out.println("3.)Start Game");
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
        System.out.println("You have died you must restart.");
    }
}
