package entities;

import entities2.Personne;

public class TestPersonne
{
	public static void main(String[] args)
	{
		AdressePostale addrA = new AdressePostale(29, "rue Victor Hugo", 42_600, "Lyon");
		AdressePostale addrB= new AdressePostale(5, "avenue Albert Camus", 80_480, "Amiens");

		Personne persA = new Personne("Pierre", "Johnson");
		persA.addr = addrA;
		
		Personne persB = new Personne("Paul", "Jacques", addrB);
	}
}
