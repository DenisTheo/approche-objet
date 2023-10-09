package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque
{
	public static void main(String[] args)
	{
		Compte client = new Compte(42, 76.99F);
		System.out.println(client);
	}
}
