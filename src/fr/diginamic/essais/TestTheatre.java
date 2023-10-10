package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre
{
	public static void main(String[] args)
	{
		Theatre theater = new Theatre("Zenith", 10_000);
		int[] clients = {1_004, 3_128, 2_637, 492, 5_703};
		double[] price = {10.50, 15.99, 12.00, 45.99, 15.99};

		System.out.println(theater.getName() + " Capacity: " + theater.getCapacity());
		for(int i=0; i<clients.length; i++)
		{
			System.out.println("\n" + theater.getName() + " +" + clients[i] + " Tickets sold at " + price[i] + ".");
			theater.inscrire(clients[i], price[i]);
			System.out.println(theater.getClients() + "/" + theater.getCapacity() + " Clients. Total Income: " + theater.getIncome() + "$.");
		}
	}
}
