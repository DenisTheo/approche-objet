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
		setClients(0);
		setIncome(0.0);
	}
	
	public void inscrire(int clients, double price)
	{
		if(clients > capacity-this.clients)
			System.out.println("Impossible to sell that many ticket.");
		else
		{
			setClients(this.clients + clients);
			addIncome(clients * price);
		}
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
	
	protected void addClients(int clients)
	{
		this.clients += clients;
	}
	
	public int getClients()
	{
		return clients;
	}
	
	protected void setIncome(double income)
	{
		this.income = income;
	}
	
	protected void addIncome(double income)
	{
		this.income += income;
	}
	
	public double getIncome()
	{
		return income;
	}
}
