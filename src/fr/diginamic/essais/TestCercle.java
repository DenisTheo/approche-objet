package fr.diginamic.essais;

import fr.diginamic.entities.*;
import fr.diginamic.utils.*;

public class TestCercle
{
	public static void main(String[] args)
	{
		Cercle circleA = CercleFactory.build(1.5);
		Cercle circleB = CercleFactory.build(3.0);

		System.out.println("CircleA: " + circleA.toString());
		System.out.println("CircleB: " + circleB.toString());
	}
}
