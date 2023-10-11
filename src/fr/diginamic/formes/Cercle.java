package fr.diginamic.formes;

public class Cercle implements Forme
{
	private double radius;
	
	public Cercle(double radius)
	{
		setRadius(radius);
	}
	
	public void setRadius(double radius)
	{
		this.radius = Math.abs(radius);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calculerPerimetre()
	{
		return 2 * Math.PI * radius;
	}
	
	public double calculerSurface()
	{
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString()
	{
		return "Radius = " + getRadius() + " | Perimeter = " + calculerPerimetre() + " | Area = " + calculerSurface();
	}
}
