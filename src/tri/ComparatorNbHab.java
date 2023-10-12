package tri;

import java.util.Comparator;
import listes.Ville;

public class ComparatorNbHab implements Comparator<Ville>
{
	public int compare(Ville cityA, Ville cityB)
	{
		if (cityA.getNbHab() > cityB.getNbHab())
			return -1;
		if (cityA.getNbHab() < cityB.getNbHab())
			return 1;
		return 0;
	}
}
