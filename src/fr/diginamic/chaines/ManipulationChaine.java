package fr.diginamic.chaines;

import entities.Salaire;

public class ManipulationChaine
{
	public static void main(String[] args)
	{
		String chaine = "Durand;Marcel;2 523.5";

		System.out.println("First character: " + chaine.charAt(0));
		System.out.println("String Length: " + chaine.length());
		System.out.println("Index of First ';': " + chaine.indexOf(';'));
		System.out.println("Last Name: " + chaine.substring(0, chaine.indexOf(';')));
		System.out.println("Last Name (Capital): " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());
		System.out.println("Last Name (lower case): " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());
		
		String[] split = chaine.split(";");
		for(int i=0; i<split.length; i++)
				System.out.println(split[i]);
		
		Salaire salary = new Salaire(split[0], split[1], Double.parseDouble(split[2].replace(" ","")));
		
		System.out.println(salary.getPrenom() + " " + salary.getNom() + ": " + salary.getSalaire() + "$.");
	}
}
