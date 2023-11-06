package fr.diginamic.testenumeration;

public enum Continent
{
	AFRIQUE("AFRIQUE"),
    AMÉRIQUE("AMÉRIQUE"),
    ASIE("ASIE"),
    EUROPE("EUROPE"),
    OCÉANIE("OCÉANIE");

    private String libelle;

    private Continent(String libelle)
    {
        this.libelle = libelle;
    }

    public String getLibelle()
    {
        return libelle;
    }
}
