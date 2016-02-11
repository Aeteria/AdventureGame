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
        System.out.println("How much health do you have?");
        int health = sc.nextInt();
        player player1 = new player(name, health, 100, 1, 1, 1);
        do{
            System.out.println("What would you like to do?");
            System.out.println("1.)Shop");
            System.out.println("2.)Fight Monsters");
            System.out.println("3.)Fight Floor Boss");
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
