package fr.diginamic.maison;

public class Salon extends Piece
{
	public Salon(double area, int floor)
	{
		super(area, floor);
	}
	
	public String getType()
	{
		return "Living Room";
	}
}
