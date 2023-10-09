package fr.diginamic.banque.entities;

public abstract class Operation
{
	private String date;
	private float amount;
	
	public Operation(String date, float amount)
	{
		setDate(date);
		setAmount(amount);
	}
	
	public String getDate()
	{
		return date;
	}
	
	protected void setDate(String date)
	{
		this.date = date;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
	protected void setAmount(float amount)
	{
		this.amount = Math.abs(amount);
	}
	
	public abstract float getDifference();
	
	protected abstract String getType();
	
	@Override
	public String toString()
	{
		return getDate() + ": " + amount + "$ " + getType();
	}
}
