package fr.diginamic.salaire;

public class Pigiste extends Intervenant
{
	private int worked_days;
	private double daily_remuneration;
	
	public Pigiste(String prenom, String nom, double daily_remuneration)
	{
		setPrenom(prenom);
		setNom(nom);
		setDailyRemuneration(daily_remuneration);
		newMonth();
	}
	
	public double getSalaire()
	{
		return worked_days * daily_remuneration;
	}
    
    public String getStatut()
    {
    	return "Freelancer";
    }

	public void setDailyRemuneration(double daily_remuneration)
	{
		this.daily_remuneration = daily_remuneration;
	}

	public double getDailyRemuneration()
	{
		return daily_remuneration;
	}

	public double getWorkedDays()
	{
		return worked_days;
	}
	
	public void addWorkedDay(int nb_days)
	{
		worked_days += nb_days;
	}
	
	public void addWorkedDay()
	{
		addWorkedDay(1);
	}
	
	public void newMonth()
	{
		worked_days = 0;
	}
    
    @Override
    public String toString()
    {
    	return super.toString() + " (" + getDailyRemuneration() + "$/day)";
    }
}
