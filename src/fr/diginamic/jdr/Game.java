package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Game
{
	Player user = null;
	
	public static void main(String[] args)
	{
		Game game = new Game();
		game.menu();
	}
	
	public void menu()
	{
		Scanner scanner = new Scanner(System.in);
		int option = 0;

        do{
        	do {
	            System.out.println("\n      -Main Menu-");
	            System.out.println("1. Create a New Character");
	            System.out.println("2. Battle a Random Enemy");
	            System.out.println("3. See My Score");
	            System.out.println("4. Quit");
	            
	            try
	            {
	            	option = scanner.nextInt();
	            }catch(Exception e)
	            {
	            	option = 0;
	            }
	            
	            switch(option)
	    		{
	    			case 1:
	    				createCharacter();
	    				menu();
	    			case 2:
	    				if (user == null)
	    					noCharacterErrorMessage();
	    				else
	    					startBattle();
	    				menu();
	    			case 3:
	    				if (user == null)
	    					noCharacterErrorMessage();
	    				else
	    					System.out.println("Your Score at the moment is " + user.getScore());
	    				menu();
	    			case 4:
	    				return;
	    			default:
	    				System.out.println("Not sure evrything went fine over here...");
	    				menu();
	    		}
        	}while(option != 1 && option != 2 && option != 3 && option != 4);
        }while(option != 4);// End the game
	}
	
	public void createCharacter()
	{
		user = new Player();
		System.out.println("HP: " + user.getHPBar());
		System.out.println("Strength: " + user.getStr());
	}
	
	public void noCharacterErrorMessage()
	{
		System.out.println("Please create a new Character first.");
	}
	
	public void startBattle()
	{
		Random rand = new Random();
		Enemy enemy = null;
		
		int gen = rand.nextInt(100)+1;
		
		if (gen <= 50)
			enemy = new Wolf();
		else if(gen <= 85)
			enemy = new Goblin();
		else
			enemy = new Troll();
		
		enemy.spriteDisplay();
		
		int player_power = 0;
		int enemy_power = 0;
		
		do
		{
			System.out.println("Your HP: " + user.getHP() + "/" + user.getHPBar() + " | Enemy HP: " + enemy.getHP());
			player_power = user.Attack();
			enemy_power = user.Attack();
			System.out.println("Your Attack Power: " + player_power + " | Enemy Attack Power: " + enemy_power);
			
			if (player_power >= enemy_power)
			{
				System.out.println("You managed to hit your enemy! Inflicted " + player_power + " damage.");
				enemy.getDamage(player_power);
			}
			else
			{
				System.out.println("Your enemy overpowered you! received " + enemy_power + " damage.");
				user.getDamage(enemy_power);
			}
		}while(enemy.getHP() > 0 && user.getHP() > 0);
		
		if(enemy.getHP() <= 0)
		{
			System.out.println("You claimed victory! +" + enemy.getScore() + " points.\nYou also healed for " + enemy.getScore() + "HP.\n");
			user.addScore(enemy.getScore());
			user.heal(enemy.getScore());
		}
		else
		{
			System.out.println("You lived through enough battles to amass " + user.getScore() + " points, until today, where you fell on the battlefield. Rest in Peace.");
			user = null;
		}
	}
}
