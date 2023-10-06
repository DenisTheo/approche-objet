package entities;

public class TestAdressePostale
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
	}
}