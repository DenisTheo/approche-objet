package sets;

import java.util.HashSet;
import java.text.DecimalFormat;

public class TestSetPays
{
	public static void main(String[] args)
	{
		HashSet<Pays> h7 = new HashSet<Pays>();
		
		h7.add(new Pays("France", 68_042_591, 43_658.98));
		h7.add(new Pays("Allemagne", 83_240_000, 51_203.55));
		h7.add(new Pays("UK", 66_022_000, 46_510.28));
		h7.add(new Pays("Italie", 60_300_000, 35_657.50));
		h7.add(new Pays("Japon", 125_700_000, 39_312.66));
		h7.add(new Pays("Chine", 1_300_000_000, 12_556.33));
		h7.add(new Pays("Russie", 125_700_000, 12_194.78));
		h7.add(new Pays("Inde", 1_428_600_000, 2_256.59));

		Pays pibHabMax = new Pays("error", 0, 0.0);
		Pays pibMax = new Pays("error", 0, 0.0);
		Pays pibMin = new Pays("error", Integer.MAX_VALUE, Double.MAX_VALUE);
		
		for(Pays country : h7)
		{
			if (country.getPibHab() > pibHabMax.getPibHab())
				pibHabMax = country;
			if (country.getPIB() > pibMax.getPibHab())
				pibMax = country;
			if (country.getPIB() < pibMin.getPibHab())
				pibMin = country;
		}
		DecimalFormat df = new DecimalFormat("#,###.##");
		System.out.println("Highest GDP per capita rate is " + pibHabMax.getNom() + " (" + df.format(pibMin.getPibHab()) + "$ per capita).");
		System.out.println("Highest GDP is " + pibMax.getNom() + " (" + df.format(pibMin.getPIB()) + "$).");
		System.out.println("Lowest GDP is " + pibMin.getNom() + " (" + df.format(pibMin.getPIB()) + "$).");
		h7.remove(pibMin);
		
		for(Pays country : h7)
			System.out.println(country.getNom());
		}
}
