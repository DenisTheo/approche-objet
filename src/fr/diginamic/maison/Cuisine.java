package fr.diginamic.maison;

public class Cuisine extends Piece
{
	public Cuisine(double area, int floor)
	{
		super(area, floor);
	}
	
	public String getType()
	{
		return RoomTypes.Room_Cuisine;
	}
}
