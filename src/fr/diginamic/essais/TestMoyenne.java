package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne
{
	public static void main(String[] args)
	{
		CalculMoyenne moy = new CalculMoyenne();
		double[] nb = {8.2, 4.75, 62.51, 99.01, 7.42,-5.0, -6.66, 666.666};

		System.out.println("Average = " + moy.calcul());
		for(int i=0; i<nb.length; i++)
		{
			System.out.println("Adding " + nb[i]);
			moy.add(nb[i]);
			System.out.println("Average = " + moy.calcul());
		}
	}
}
