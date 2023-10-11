package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestVille
{
	public static void main(String[] args)
	{
		List<Ville> list = new ArrayList<Ville>();
		list.add(new Ville("Nice", 343_000));
		list.add(new Ville("Carcassonne", 47_800));
		list.add(new Ville("Narbonne", 53_400));
		list.add(new Ville("Lyon", 484_000));
		list.add(new Ville("Foix", 9_700));
		list.add(new Ville("Pau", 77_200));
		list.add(new Ville("Marseille", 850_700));
		list.add(new Ville("Tarbes", 40_600));
		
		Iterator<Ville> iterator = list.iterator();

		Ville target = new Ville("Erreur", 0);
	
		for(int i=0; i<list.size(); i++)
			if (list.get(i).getNbHab() > target.getNbHab())
				target = list.get(i);
		System.out.println("Largest City is " + target.getNom() + ".");

		while (iterator.hasNext())
		{
            Ville next = iterator.next();
            if (next.getNbHab() < target.getNbHab())
            	target = next;
        }
		list.remove(target);

		iterator = list.iterator(); // reset
		while (iterator.hasNext())
		{
            Ville next = iterator.next();
            if (next.getNbHab() > 100_000)
            	next.setNom(next.getNom().toUpperCase());;
        }
	
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).getNom());
	}
}
