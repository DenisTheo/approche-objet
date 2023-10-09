package fr.diginamic.banque.entities;

public class CompteTaux extends Compte
{
	float rate;
	
	public CompteTaux(int id, float balance, float rate)
	{
		super(id, balance);
		setRate(rate);
	}
	
	public float getRate()
	{
		return rate;
	}
	
	protected void setRate(float rate)
	{
		this.rate = rate;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Rate: " + rate;
	}
}
