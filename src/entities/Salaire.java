package entities;

public class Salaire
{
	private String nom;
	private String prenom;
	private double salaire;
	
	public Salaire(String nom, String prenom, double salaire)
	{
		setNom(nom);
		setPrenom(prenom);
		setSalaire(salaire);
	}
	
    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public double getSalaire()
    {
        return salaire;
    }

    public void setSalaire(double salaire)
    {
        this.salaire = salaire;
    }
}
