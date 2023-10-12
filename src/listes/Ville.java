package listes;

public class Ville
{
	private String nom;
	private int nbHab;
	
	public Ville(String nom, int nbHab)
	{
		setNom(nom);
		setNbHab(nbHab);
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public void setNbHab(int nbHab)
	{
		this.nbHab = nbHab;
	}
	
	public int getNbHab()
	{
		return nbHab;
	}
	
	@Override
	public String toString()
	{
		return getNom() + " - Residents: " + getNbHab();
	}
}
