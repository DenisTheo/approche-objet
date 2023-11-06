package fr.diginamic.recensement;

public class MenuPopCity extends MenuService
{
	public MenuPopCity(Recensement recensement)
	{
		super(recensement);
	}

	public void traiter(Recensement recensement)
	{
		int input;
		do
		{
			System.out.print("\n1. See the Population Count of a given City\n"
                             + "   Please Enter the city's Post Code\n"
                             + "     > ");
	        try
	        {
	         	input = scanner.nextInt();
	        }catch(Exception e)
	        {
	        	input = 0;
	        	System.out.println("Please enter a valid option.");
	        	pause(1000);
	        	clear();
	        }
		}while(!recensement.checkPostCodeValidity(input));
		
		PostCode postcode = PostCode.parse(input, recensement);
		Ville city = recensement.getCity(PostCode.parse(input, recensement));
		System.out.println("Population of " + city.getNomCommune() + ": " + city.getPop() + ".");
		waitForInput();
	}
}
