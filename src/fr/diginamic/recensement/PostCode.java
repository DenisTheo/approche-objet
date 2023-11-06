package fr.diginamic.recensement;

public class PostCode
{
	private String codeRegion;
	private String codeDepartment;
	private String codeMunicipality;

	public PostCode(String codeRegion, String codeDepartment, String codeMunicipality)
	{
		setCodeRegion(codeRegion);
		setCodeDepartment(codeDepartment);
		setCodeMunicipality(codeMunicipality);
	}
	
	public static PostCode parse(int code, Recensement recensement)
	{// Over complicated for no real reason besides an approximative conception...
		if(code >= 100 && code <= 999999)
		{
			try
			{
				String department = String.valueOf(code / 1000);
				String region = getRegionOf(department, recensement);
				
				if(region != null)
				{
					String municipality = String.valueOf(code % 1000);
					return new PostCode(region, department, municipality);
				}
			}catch(Exception e)
			{
				throw e;
			}
		}
		return null;
	}
    
    public static String getRegionOf(String testDepartmentCode, Recensement recensement)
    {
    	for(PostCode code : recensement.getCitiesMap().keySet())
    		if (code.getCodeDepartment().equals(testDepartmentCode))
    			return code.getCodeRegion();
    	return null;
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
	
	public int getCode()
	{
		return Integer.parseInt(getCodeDepartment()) * 1_000 + Integer.parseInt(getCodeMunicipality());
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
