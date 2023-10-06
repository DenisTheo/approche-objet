package entities2;

import entities.AdressePostale;

public class Personne
{
	public String first_name;
	public String last_name;
	public AdressePostale addr;
	
	public Personne(String first_name, String last_name)
	{
		this.first_name = first_name;
		this.first_name = last_name;
	}
	
	public Personne(String first_name, String last_name, AdressePostale addr)
	{
		this.first_name = first_name;
		this.first_name = last_name;
		this.addr = new AdressePostale(addr.number, addr.street, addr.postcode, addr.city);
	}
}
