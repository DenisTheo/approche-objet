package tri;

import listes.Ville;

public class VilleA extends Ville implements Comparable<Ville>
{
	public VilleA(String nom, int nbHab)
	{
		super(nom, nbHab);
	}

	@Override
	public int compareTo(Ville other)
	{
		return getNom().compareTo(other.getNom());
	}
}