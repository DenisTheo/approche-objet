package fr.diginamic.maison;

public abstract class Piece
{
	private double area;
	private int floor;
	
	public Piece(double area, int floor)
	{
		setArea(area);
		setFloor(floor);
	}
	
	public double getArea()
	{
	    return area;
	}

	public void setArea(double area)
	{
	    this.area = area;
	}

	public int getFloor()
	{
	    return floor;
	}

	public void setFloor(int floor)
	{
	    this.floor = floor;
	}
	
	public abstract String getType();
}
