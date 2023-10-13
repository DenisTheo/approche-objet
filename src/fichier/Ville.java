package fichier;

public class Ville {

    private String nom;
    private String code;
    private String nomRegion;
    private int pop;

    public Ville(String nom, String code, String nomRegion, int pop)
    {
        setNom(nom);
        setCode(code);
        setNomRegion(nomRegion);
        setPop(pop);
    }

    public String getNom()
    {
        return nom;
    }

    protected void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getCode()
    {
        return code;
    }

    protected void setCode(String code)
    {
        this.code = code;
    }

    public String getNomRegion()
    {
        return nomRegion;
    }

    protected void setNomRegion(String nomRegion)
    {
        this.nomRegion = nomRegion;
    }

    public int getPop()
    {
        return pop;
    }

    protected void setPop(int pop)
    {
        this.pop = pop;
    }
    
    @Override
    public String toString()
    {
    	return getNomRegion() + ", " + getCode() + ", "
             + getNom() + ": " + getPop() + " Residents";
    }
}