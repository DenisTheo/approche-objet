package maps;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap
{
	public static void main(String args[])
	{
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		System.out.println("Size: " + mapVilles.size());

		System.out.println("Keys (done with a for each):");
		for(int key : mapVilles.keySet())
			System.out.println(key);
		
		System.out.println("Values (done with an iterator):");
		Iterator<String> iterator = mapVilles.values().iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
