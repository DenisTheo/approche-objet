package tri;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import listes.Ville;

public class TestVille
{
	public static void main(String[] args)
	{
		List<Ville> list1 = new ArrayList<>();
		
		list1.add(new VilleA("Nice", 343_000));
		list1.add(new VilleA("Carcassonne", 47_800));
		list1.add(new VilleA("Narbonne", 53_400));
		list1.add(new VilleA("Lyon", 484_000));
		list1.add(new VilleA("Foix", 9_700));
		list1.add(new VilleA("Pau", 77_200));
		list1.add(new VilleA("Marseille", 850_700));
		list1.add(new VilleA("Tarbes", 40_600));
		
		display(list1);
		
		System.out.println("============VilleA Class=============");
		
		list1.sort(null);
		
		display(list1);
		
		System.out.println("============VilleB Class=============");
		
		List<Ville> list2 = new ArrayList<>();
		
		list2.add(new VilleB("Nice", 343_000));
		list2.add(new VilleB("Carcassonne", 47_800));
		list2.add(new VilleB("Narbonne", 53_400));
		list2.add(new VilleB("Lyon", 484_000));
		list2.add(new VilleB("Foix", 9_700));
		list2.add(new VilleB("Pau", 77_200));
		list2.add(new VilleB("Marseille", 850_700));
		list2.add(new VilleB("Tarbes", 40_600));
		
		list2.sort(null);
		
		display(list2);
		
		System.out.println("========ComparatorNom Class========");
		List<Ville> list = new ArrayList<>();
		
		list.add(new Ville("Nice", 343_000));
		list.add(new Ville("Carcassonne", 47_800));
		list.add(new Ville("Narbonne", 53_400));
		list.add(new Ville("Lyon", 484_000));
		list.add(new Ville("Foix", 9_700));
		list.add(new Ville("Pau", 77_200));
		list.add(new Ville("Marseille", 850_700));
		list.add(new Ville("Tarbes", 40_600));
		
		Collections.sort(list, new ComparatorNom());
		display(list);

		System.out.println("=======ComparatorNbHab Class======");
		
		Collections.sort(list, new ComparatorNbHab());
		display(list);
	}

	public static void display(List<Ville> list)
	{
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).toString());
	}
}
