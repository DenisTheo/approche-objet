package fr.diginamic.banque.entities;

public class Compte
{
	private int id;
	private float balance;
	
	public Compte(int id, float balance)
	{
		setID(id);
		setBalance(balance);
	}
	
	public int getID()
	{
		return id;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	protected void setID(int id)
	{
		this.id = Math.abs(id);
	}
	
	protected void setBalance(float balance)
	{
		this.balance = balance;
	}
	
	public void Transaction(Operation operation)
	{
		balance += operation.getDifference();
	}
	
	@Override
	public String toString()
	{
		return "Account " + id + " - Balance: " + balance + "$";
	}
}
