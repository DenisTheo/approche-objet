package sets;

public class Pays
{
	String nom;
	int nbHab;
	double pibHab;
	
	public Pays(String nom, int nbHab, double pibHab)
	{
		setNom(nom);
		setNbHab(nbHab);
		setPibHab(pibHab);
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
	
	public void setPibHab(double pibHab)
	{
		this.pibHab = pibHab;
	}
	
	public double getPibHab()
	{
		return pibHab;
	}
	
	public double getPIB()
	{
		return pibHab * nbHab;
	}
}
