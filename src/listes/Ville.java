package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville
{
	private String nom;
	private int nbHab;
	private Continent continent;

	public Ville(String nom, int nbHab)
	{
		setNom(nom);
		setNbHab(nbHab);
		setContinent(null);
	}
	
	public Ville(String nom, int nbHab, Continent continent)
	{
		setNom(nom);
		setNbHab(nbHab);
		setContinent(continent);
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
	
	public void setContinent(Continent continent)
	{
		this.continent = continent;
	}
	
	public Continent getContinent()
	{
		return continent;
	}
	
	@Override
	public String toString()
	{
		if (continent != null)
			return getNom() + " - Residents: " + getNbHab() + " - Continent: " + getContinent().getLibelle();
		return getNom() + " - Residents: " + getNbHab();
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(!(object instanceof Ville))
				return false;
		
		Ville other = (Ville) object;
		if(getNom() == null || other.getNom() == null)
			return false;
		
		return getNom().equals(other.getNom()) && getNbHab() == other.getNbHab();
	}
}
