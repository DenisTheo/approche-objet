package entities;

import entities2.Personne;

public class TestPersonne
{
	public static void main(String[] args)
	{
		AdressePostale addrA = new AdressePostale();
		AdressePostale addrB = new AdressePostale();
		
		addrA.number = 29;
		addrA.street = "rue Victor Hugo";
		addrA.postcode = 42_600;
		addrA.city = "Lyon";
		
		addrB.number = 5;
		addrB.street = "avenue Albert Camus";
		addrB.postcode = 80_480;
		addrB.city = "Amiens";

		Personne persA = new Personne();
		Personne persB = new Personne();

		persA.first_name = "Pierre";
		persA.last_name = "Johnson";
		persA.addr = addrA;
		
		persA.first_name = "Paul";
		persA.last_name = "Jacques";
		persA.addr = addrB;
	}
}
