package maps;

public class Pays
{
	private String nom;
	private int nbHab;
	private String continent;
	
	public Pays(String nom, int nbHab, String continent)
	{
        setNom(nom);
        setNbHab(nbHab);
        setContinent(continent);
    }

    // Getters
    public String getNom()
    {
        return nom;
    }

    public int getNbHab()
    {
        return nbHab;
    }

    public String getContinent()
    {
        return continent;
    }

    // Setters
    protected void setNom(String nom)
    {
        this.nom = nom;
    }

    protected void setNbHab(int nbHab)
    {
        this.nbHab = nbHab;
    }

    protected void setContinent(String continent)
    {
        this.continent = continent;
    }
}
