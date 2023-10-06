package entities;

public class AdressePostale
{
	public int number;
	public String street;
	public int postcode;
	public String city;
	
	public AdressePostale(int number, String street, int postcode, String city)
	{
		this.number = number;
		this.street = street;
		this.postcode = postcode;
		this.city = city;
	}
}
