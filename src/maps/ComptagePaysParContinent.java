package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent
{
	public static void main(String[] args)
	{
		ArrayList<Pays> countries = new ArrayList<>();

		countries.add(new Pays("France", 65_000_000, "Europe"));
        countries.add(new Pays("Allemagne", 80_000_000, "Europe"));
        countries.add(new Pays("Belgique", 10_000_000, "Europe"));
        countries.add(new Pays("Russie", 150_000_000, "Asie"));
        countries.add(new Pays("Chine", 1_400_000_000, "Asie"));
        countries.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        countries.add(new Pays("Australie", 20_000_000, "Océanie"));

        for(Pays country : countries)
            System.out.println("[" + country.getContinent() + "] " + country.getNom() + " - " + country.getNbHab() + " inhabitants");
        
        System.out.println("=============================================================");
        
        HashMap<String, Integer> worldMap = new HashMap<String, Integer>();
        
        for(Pays country : countries)
        {
        	int total = country.getNbHab();
        	if (worldMap.containsKey(country.getContinent()))
        		total += worldMap.get(country.getContinent());
        		
        	worldMap.put(country.getContinent(), total);
        }
        
        for(Map.Entry<String, Integer> continent : worldMap.entrySet())
        	System.out.println(continent.getKey() + ": " + continent.getValue() + " inhabitants.");
	}
}
