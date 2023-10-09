package fr.diginamic.banque.entities;

public class Compte
{
	private int id;
	private double balance;
	
	public Compte(int id, double balance)
	{
		setID(id);
		setBalance(balance);
	}
	
	public int getID()
	{
		return id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	protected void setID(int id)
	{
		this.id = id;
	}
	
	protected void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void credit(double amount)
	{
		balance += amount;
	}
	
	public void debit(double amount)
	{
		balance -= amount;
	}
}
