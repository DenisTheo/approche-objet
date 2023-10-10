package fr.diginamic.salaire;

public class Salarie extends Intervenant
{
	private double salaire;
	
	public Salarie(String prenom, String nom, double salaire)
	{
		setPrenom(prenom);
		setNom(nom);
		setSalaire(salaire);
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
