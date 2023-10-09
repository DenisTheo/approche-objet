package fr.diginamic.essais;

import fr.diginamic.entities.*;

public class TestCercle
{
	public static void main(String[] args)
	{
		Cercle circleA = new Cercle(3);
		Cercle circleB = new Cercle(1);

		System.out.println("CircleA: " + circleA.toString());
		System.out.println("CircleB: " + circleB.toString());
	}
}
