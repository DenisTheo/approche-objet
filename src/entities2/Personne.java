package entities2;

import entities.AdressePostale;

public class Personne
{
	public String first_name;
	public String last_name;
	public AdressePostale addr;
	
	public Personne(String first_name, String last_name)
	{
		setFirstName(first_name);
		setLastName(last_name);
	}
	
	public Personne(String first_name, String last_name, AdressePostale addr)
	{
		setFirstName(first_name);
		setLastName(last_name);
		setAddress(addr);
	}
	
	public void Display()
	{
		System.out.print(first_name + " " + last_name.toUpperCase());
	}
	
	public void setLastName(String last_name)
	{
		this.last_name = last_name;
	}
	
	public String getLastName()
	{
		return last_name;
	}
	
	public void setFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	
	public String getFirstName()
	{
		return first_name;
	}
	
	public void setAddress(AdressePostale addr)
	{
		this.addr = addr;
	}
	
	public AdressePostale getAddress()
	{
		return addr;
	}
}
