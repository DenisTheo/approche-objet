package fr.diginamic.formes;

public class Rectangle implements Forme
{
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur)
	{
		if(longueur >= largeur)
		{
			setLongueur(longueur);
			setLargeur(largeur);
		}
		else
		{
			setLongueur(largeur);
			setLargeur(longueur);
		}
	}
	
	public void setLongueur(double longueur)
	{
		this.longueur = Math.abs(longueur);
	}
	
	public double getLongueur()
	{
		return longueur;
	}
	
	public void setLargeur(double largeur)
	{
		this.largeur = Math.abs(largeur);
	}
	
	public double getLargeur()
	{
		return largeur;
	}
	
	public double calculerPerimetre()
	{
		return 2 * longueur + 2 * largeur;
	}
	
	public double calculerSurface()
	{
		return longueur * largeur;
	}
	
	@Override
	public String toString()
	{
		return "L = " + getLongueur() + " l = " + getLargeur() + " | Perimeter = " + calculerPerimetre() + " | Area = " + calculerSurface();
	}
}
