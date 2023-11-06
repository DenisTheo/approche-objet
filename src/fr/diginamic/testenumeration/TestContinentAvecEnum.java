package fr.diginamic.testenumeration;

import java.util.List;
import java.util.ArrayList;
import listes.Ville;

public class TestContinentAvecEnum
{
	public static void main(String[] args)
	{
		List<Ville> cities = new ArrayList<Ville>();

		cities.add(new Ville("New York", 2_000_000, Continent.AMÉRIQUE));
		cities.add(new Ville("Paris", 1_000_000, Continent.EUROPE));
		cities.add(new Ville("PÉKIN", 5_000_000, Continent.ASIE));
		cities.add(new Ville("Moscou", 500_000, Continent.ASIE));
		cities.add(new Ville("Berlin", 800_000, Continent.EUROPE));
		cities.add(new Ville("Sydney", 200_000, Continent.OCÉANIE));
		cities.add(new Ville("Sao Paulo", 1_500_000, Continent.AMÉRIQUE));
		cities.add(new Ville("Dakar", 300_000, Continent.AFRIQUE));
		
		for(Ville city : cities)
			System.out.println(city.toString());
	}
}
