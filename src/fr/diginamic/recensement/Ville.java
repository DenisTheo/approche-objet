package fr.diginamic.recensement;

public class Ville
{
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int pop;
    // I don't use the PostCode Class, as this structure was asked in document

    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int pop)
    {
        setCodeRegion(codeRegion);
        setNomRegion(nomRegion);
        setCodeDepartement(codeDepartement);
        setCodeCommune(codeCommune);
        setNomCommune(nomCommune);
        setPop(pop);
    }
    
    @Override
    public String toString()
    {
    	return "[" + getNomRegion() + "(" + getCodeRegion() + ")] " + getPostCode()
    	     + ", " + getNomCommune() + ": " + getPop() + " Residents";
    }
    
    public String getPostCode()
    {
    	return getCodeDepartement() + " " + getCodeCommune();
    }

    public String getCodeRegion()
    {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion)
    {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion()
    {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion)
    {
        this.nomRegion = nomRegion;
    }

    public String getCodeDepartement()
    {
        return codeDepartement;
    }

    protected void setCodeDepartement(String codeDepartement)
    {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeCommune()
    {
        return codeCommune;
    }

    protected void setCodeCommune(String codeCommune)
    {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune()
    {
        return nomCommune;
    }

    protected void setNomCommune(String nomCommune)
    {
        this.nomCommune = nomCommune;
    }

    public int getPop()
    {
        return pop;
    }

    protected void setPop(int pop)
    {
        this.pop = pop;
    }
}
