package fr.diginamic.salaire;

public abstract class Intervenant
{
	private String nom;
	private String prenom;
	
	public abstract double getSalaire();
    
    public abstract String getStatut();
	
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
    
    public void AfficherDonnees()
    {
    	System.out.println(toString());
    }
    
    @Override
    public String toString()
    {
    	return getPrenom() + " " + getNom().toUpperCase() + " - " + getStatut() + " - " + getSalaire() + "$";
    }
}
