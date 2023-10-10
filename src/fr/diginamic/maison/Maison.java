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
		if(room == null)
			System.out.println("can't add a null room");
		else
		{
			Piece[] newRooms = new Piece[rooms.length+1];
			
			System.arraycopy(rooms, 0, newRooms, 0, rooms.length);
			
			newRooms[newRooms.length-1] = room;
			
			rooms = newRooms;
			
			System.out.println("added a " + room.getType());
		}
	}
	
	public double getTotalArea()
	{
		double total = 0.0;
		
		for(int i=0; i<rooms.length; i++)
			total += rooms[i].getArea();
		
		return total;
	}
	
	public double getFloorArea(int floor)
	{
		double total = 0.0;
		
		for(int i=0; i<rooms.length; i++)
			if (rooms[i].getFloor() == floor)
				total += rooms[i].getArea();
		
		return total;
	}
	
	public double getAreaByType(Piece room)
	{
		if (room == null)
			return 0.0;
		
		double total = 0.0;
		
		for(int i=0; i<rooms.length; i++)
			if (rooms[i].getType().equals(room.getType()))
				total += rooms[i].getArea();
		
		return total;
	}
	
	public int getNumberOfRooms()
	{
		return rooms.length;
	}
	
	public int getNumberOfRoomsByType(Piece room)
	{
		if (room == null)
			return 0;
		
		int total = 0;
		
		for(int i=0; i<rooms.length; i++)
			if (rooms[i].getType().equals(room.getType()))
				total++;
		
		return total;
	}
	
	public int getNumberOfRoomsByFloor(int floor)
	{
		int total = 0;
		
		for(int i=0; i<rooms.length; i++)
			if (rooms[i].getFloor() == floor)
				total++;
		
		return total;
	}
}
