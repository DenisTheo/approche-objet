package tri;

import listes.Ville;

public class VilleB extends Ville implements Comparable<Ville>
{
	public VilleB(String nom, int nbHab)
	{
		super(nom, nbHab);
	}

	@Override
	public int compareTo(Ville other)
	{
		if (getNbHab() > other.getNbHab())
			return -1;
		if (getNbHab() < other.getNbHab())
			return 1;
		return 0;
	}
}