package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque
{
	public static void main(String[] args)
	{
		Compte[] client = {new Compte(42, 76.99F), new CompteTaux(64, 62.51F, 1.05F)};
		
		for(int i=0; i<client.length; i++)
			System.out.println(client[i].toString());
	}
}
