package fr.diginamic.formes;

public class Carre extends Rectangle
{
	public Carre(double longueur)
	{
		super(longueur, longueur);
	}
	
	@Override
	public String toString()
	{
		return "L = " + getLongueur() + " | Perimeter = " + calculerPerimetre() + " | Area = " + calculerSurface();
	}
}
