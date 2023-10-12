package tri;

import java.util.Comparator;
import listes.Ville;

public class ComparatorNom implements Comparator<Ville>
{
	public int compare(Ville cityA, Ville cityB)
	{
		return cityA.getNom().compareTo(cityB.getNom());
	}
}
