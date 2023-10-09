package fr.diginamic.banque.entities;

import entities.Color;

public class Debit extends Operation
{
	public Debit(String date, float amount)
	{
		super(date, amount);
	}
	
	protected String getType()
	{
		return "DEBIT";
	}
	
	public float getDifference()
	{
		return -1 * getAmount();
	}
	
	@Override
	public String toString()
	{
		return Color.RED + super.toString() + Color.RESET;
	}
}
