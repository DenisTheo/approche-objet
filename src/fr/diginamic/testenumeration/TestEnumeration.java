package fr.diginamic.testenumeration;

public class TestEnumeration
{
	public static void main(String[] args)
	{
		for (Saison saison : Saison.values())
			System.out.println(saison.toString());
		
		String target = "ÉTÉ";

        try
        {
            Saison saison = Saison.valueOf(target);
            System.out.println("Found: " + saison.toString());
        } catch (IllegalArgumentException e)
        {
            System.out.println("Could not find " + target + ".");
        }
        
        target = "HIVER";

        try
        {
            Saison saison = Saison.getSaisonByLibelle(target);
            System.out.println("Found: " + saison.toString());
        } catch (IllegalArgumentException e)
        {
            System.out.println("Could not find " + target + ".");
        }
	}
}
