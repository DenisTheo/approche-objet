package fr.diginamic.entities;

public class Theatre
{
	private String name;
	private int capacity;
	private int clients;
	private double income;
	
	public Theatre(String name, int capacity)
	{
		setName(name);
		setCapacity(capacity);
	}
	
	public void inscrire()
	{
		
	}
	
	protected void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	protected void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	protected void setClients(int clients)
	{
		this.clients = clients;
	}
	
	public int getClients()
	{
		return clients;
	}
	
	protected void setIncome(int income)
	{
		this.income = income;
	}
	
	public double getIncome()
	{
		return income;
	}
}
