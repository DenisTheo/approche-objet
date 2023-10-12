package maps;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import listes.Ville;

public class MapVilles
{
	
	public static void main(String[] args)
	{
		Map<String, Ville> map = new HashMap<String, Ville>();
		
		map.put("Nice", new Ville("Nice", 343_000));
		map.put("Carcassonne", new Ville("Carcassonne", 47_800));
		map.put("Narbonne", new Ville("Narbonne", 53_400));
		map.put("Lyon", new Ville("Lyon", 484_000));
		map.put("Foix", new Ville("Foix", 9_700));
		map.put("Pau", new Ville("Pau", 77_200));
		map.put("Marseille", new Ville("Marseille", 850_700));
		map.put("Tarbes", new Ville("Tarbes", 40_600));

		Iterator<String> iterator = map.keySet().iterator();
		Ville target = new Ville("Erreur", Integer.MAX_VALUE);
		String key = "";

		while (iterator.hasNext())
		{
            String next = iterator.next();
            if (map.get(next).getNbHab() < target.getNbHab())
            {
            	key = next;
            	target = map.get(key);
            }
        }
		map.remove(key);
		System.out.println("Removed " + key);
	}
}
