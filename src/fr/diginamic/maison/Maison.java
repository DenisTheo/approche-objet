package fr.diginamic.maison;

public class Maison
{
	private Piece[] rooms;
	
	public Maison()
	{
		rooms = new Piece[0];
	}
	
	public void ajouterPiece(Piece room)
	{
		Piece[] newRooms = new Piece[rooms.length+1];
		
		System.arraycopy(rooms, 0, newRooms, 0, rooms.length);
		
		newRooms[newRooms.length-1] = room;
		
		rooms = newRooms;
	}
}
