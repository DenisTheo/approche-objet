package fr.diginamic.recensement;

public class PostCode
{
	private String codeRegion;
	private String codeDepartment;
	private String codeMunicipality;

	public PostCode(String codeDepartement, String codeDepartment, String codeMunicipality)
	{
		setCodeRegion(codeRegion);
		setCodeDepartment(codeDepartment);
		setCodeMunicipality(codeMunicipality);
	}
	
	@Override
	public boolean equals(Object other)
	{
		return this.toString().trim().replace(" ", "").equals(other.toString().trim().replace(" ", ""));
	}
	
	@Override
	public String toString()
	{
		return getCodeDepartment() + " " + getCodeMunicipality();
	}
	
	public String getCodeMunicipality()
	{
        return codeMunicipality;
    }

    public void setCodeMunicipality(String codeMunicipality) 
    {
        this.codeMunicipality = codeMunicipality;
    }

    public String getCodeDepartment()
    {
        return codeDepartment;
    }

    public void setCodeDepartment(String codeDepartment)
    {
        this.codeDepartment = codeDepartment;
    }

    public String getCodeRegion()
    {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion)
    {
        this.codeRegion = codeRegion;
    }
}
