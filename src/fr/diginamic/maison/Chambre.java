package fr.diginamic.maison;

public class Chambre extends Piece
{
	public Chambre(double area, int floor)
	{
		super(area, floor);
	}
	
	public String getType()
	{
		return RoomTypes.Room_Chambre;
	}
}
