package fr.diginamic.entities;

public class Cercle
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
	
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString()
	{
		return "Radius = " + radius + " | Perimeter = " + getPerimeter() + " | Area = " + getArea();
	}
}
