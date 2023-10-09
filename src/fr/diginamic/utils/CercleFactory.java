package fr.diginamic.utils;

import fr.diginamic.entities.Cercle;

public class CercleFactory
{
	public static Cercle build(double radius)
	{
		return new Cercle(radius);
	}
}
