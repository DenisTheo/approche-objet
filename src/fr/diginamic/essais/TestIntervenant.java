package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant
{
	public static void main(String[] args)
	{
		Salarie sm = new Salarie("Sienna", "Morgan", 2_625.10);
		Pigiste jpp = new Pigiste("Jean-Pierre", "Polnareff", 128.64);
		
		sm.AfficherDonnees();
		jpp.AfficherDonnees();

		System.out.println("\nSalary SM: " + sm.getSalaire() + "\n");
		System.out.println("Salary JPP (0 days): " + jpp.getSalaire());
		jpp.addWorkedDay();
		System.out.println("Salary JPP (+1 day): " + jpp.getSalaire());
		jpp.addWorkedDay(10);
		System.out.println("Salary JPP (+10 days): " + jpp.getSalaire());
		jpp.newMonth();
		System.out.println("Salary JPP (New Month): " + jpp.getSalaire());
		jpp.addWorkedDay(+3);
		System.out.println("Salary JPP (+3 day): " + jpp.getSalaire());
		jpp.addWorkedDay(-1);
		System.out.println("Salary JPP (-1 day): " + jpp.getSalaire());
	}
}
