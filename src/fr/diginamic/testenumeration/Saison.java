package fr.diginamic.testenumeration;

public enum Saison
{
	PRINTEMPS("PRINTEMPS", 1),
    ETE("ÉTÉ", 2),
    AUTOMNE("AUTOMNE", 3),
    HIVER("HIVER", 4);

    private String libelle;
    private int ordre;

    private Saison(String libelle, int ordre)
    {
        this.libelle = libelle;
        this.ordre = ordre;
    }
    
    public static Saison getSaisonByLibelle(String libelle)
    {
    	for(Saison season : values())
			if (season.getLibelle().equals(libelle))
				return season;
    	throw new IllegalArgumentException("Could not find " + libelle + ".");
    }

    public String getLibelle()
    {
        return libelle;
    }

    public int getOrdre()
    {
        return ordre;
    }
    
    @Override
    public String toString()
    {
    	return getOrdre() + ": " + getLibelle();
    }
}
