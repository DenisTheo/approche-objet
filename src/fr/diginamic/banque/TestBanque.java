package fr.diginamic.banque;

import fr.diginamic.banque.entities.*;

public class TestBanque
{
	public static void main(String[] args)
	{
		Compte[] clients = {new Compte(42, 76.99F), new CompteTaux(64, 62.51F, 1.05F)};
		
		for(int i=0; i<clients.length; i++)
			System.out.println(clients[i].toString());

		System.out.println("\n===========================\n");
		
		Credit cred2 = new Credit("2023-10-02", 1_762.54F);
		Credit cred1 = new Credit("2023-10-07", 4.00F);
		Debit deb1 = new Debit("2023-10-03", 21.99F);
		Debit deb2 = new Debit("2023-10-09", 450.00F);
		Operation[] operations = {cred1, deb1, cred2, deb2};

		System.out.println(clients[0].toString());
		for(int i=0; i<operations.length; i++)
		{
			clients[0].Transaction(operations[i]);
			System.out.println(operations[i].toString());
			System.out.println("Change on " + clients[0].toString());
		}
	}
}
