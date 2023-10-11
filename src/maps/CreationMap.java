package maps;

import java.util.Map;
import java.util.HashMap;

public class CreationMap
{
	public static void main(String[] args)
	{
		Map<String, Integer> salaries = new HashMap<>();

		salaries.put("Paul", 1_750);
		salaries.put("Hicham", 1_825);
		salaries.put("Yu", 2_250);
		salaries.put("Ingrid", 2_015);
		salaries.put("Chantal", 2_418);

		for (Map.Entry<String, Integer> employee : salaries.entrySet())
		{
            System.out.println("Clé : " + employee.getKey() + ", Valeur : " + employee.getValue());
        }
		
		System.out.println("Size: " + salaries.size());

	}
}
