package fr.diginamic.operations;

public class CalculMoyenne
{
	private double[] nb;
	
	public CalculMoyenne()
	{
		nb = new double[0];
	}
	
	public void add(double number)
	{
		// Creating a carbon copy of the nb array, but with one additional slot
		double[] nb_update = new double[nb.length+1];
		for(int i=0; i<nb.length; i++) // fills the new array to copy nb's content
			nb_update[i] = nb[i];
		
		nb_update[nb.length] = number; // new number is added
		
		nb = nb_update; // replaces the current array with the new one
	}
	
	public double calcul()
	{// calculating sum total
		if (nb.length < 1)
			return 0.0;
		
		double total = 0.0;
		for(int i=0; i<nb.length; i++)
			total += nb[i];
		// calcul of the average
		return total / nb.length;
	}
}
