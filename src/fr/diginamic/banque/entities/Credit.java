package fr.diginamic.banque.entities;

import entities.Color;

public class Credit extends Operation
{
	public Credit(String date, float amount)
	{
		super(date, amount);
	}
	
	protected String getType()
	{
		return "CREDIT";
	}
	
	public float getDifference()
	{
		return getAmount();
	}
	
	@Override
	public String toString()
	{
		return Color.GREEN + super.toString() + Color.RESET;
	}
}
