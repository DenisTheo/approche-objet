package fr.diginamic.maison;

public class SalleDeBain extends Piece
{
	public SalleDeBain(double area, int floor)
	{
		super(area, floor);
	}
	
	public String getType()
	{
		return RoomTypes.Room_SalleDeBain;
	}
}
