package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations
{
	public static void main(String[] args)
	{
		char[] operators = {'+', '-', '*', '/'};
		for(int i=0; i<operators.length; i++)
			System.out.println("Operations.calcul(666.42, 62.51, '" + operators[i] + "') = " + Operations.calcul(666.42, 62.51, operators[i]));
	}
}
