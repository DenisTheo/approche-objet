package maps;

import java.util.Map;
import java.util.HashMap;

public class CreationMap
{
	public static void main(String[] args)
	{
		Map<String, Integer> mapSalaires = new HashMap<>();

		mapSalaires.put("Paul", 1_750);
		mapSalaires.put("Hicham", 1_825);
		mapSalaires.put("Yu", 2_250);
		mapSalaires.put("Ingrid", 2_015);
		mapSalaires.put("Chantal", 2_418);

		for (Map.Entry<String, Integer> employee : mapSalaires.entrySet())
            System.out.println("Clé : " + employee.getKey() + ", Valeur : " + employee.getValue());
		
		System.out.println("Size: " + mapSalaires.size());

	}
}
