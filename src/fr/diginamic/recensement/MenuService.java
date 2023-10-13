package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService
{
	public static Scanner scanner = new Scanner(System.in);
	
	public MenuService(Recensement recensement)
	{
		traiter(recensement);
	}
	
	protected void clear()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	protected void pause(int ms)
	{
		try
		{
		    Thread.sleep(ms);
		} catch (InterruptedException e)
		{
		    e.printStackTrace();
		}
	}
	
	protected void waitForinput()
	{
		System.out.println("Press any key to continue");
	    scanner.nextLine();
	}

	public abstract void traiter(Recensement recensement);
}
