package fr.diginamic.recensement;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;

public class Recensement
{
	private HashMap<PostCode, Ville> cities;
	
	public Recensement()
	{
		cities = new HashMap<PostCode, Ville>();
	}
	
	// relativePath is the (relative) path to the input file
	public boolean getDataSet(String relativePath)
	{
		Path path = Paths.get(relativePath);
		List<String> lines;
		
		try
		{
			lines = Files.readAllLines(path);
		} catch(Exception e)
		{
			System.out.println("Couldn't read the input file.");
			return false; // we tell the app that it cannot continue
		}
		
		// Filling the list with data (skipping the header)
		for (int i=1; i<lines.size(); i++)
		{// Get the next line
			String[] splitLine = lines.get(i).split(";");
			
			// splitLine[0] = Region Code, [2] = Department Code, [5] = Municipality Code
			PostCode code = new PostCode(splitLine[0], splitLine[2], splitLine[5]);
			
			// splitLine[9] = Total Population
			int pop = Integer.parseInt(splitLine[9].trim().replaceAll(" ", ""));
			
			// splitLine[0] = Region Code, [1] = RegionName, [2] = Code Department,
			Ville city = new Ville(splitLine[0], splitLine[1], splitLine[2], //[5] = City/Municipality Code,
					               splitLine[5], splitLine[6], pop); // [6] = City/Municipality Name
			
			cities.put(code, city);
		}

		return true; // notifies the data assimilation was a success
	}
	
	public boolean checkPostCodeValidity(int code)
	{
		for(PostCode zipcode : cities.keySet())
		{
			try
			{
				if (zipcode.getCode() == code)
					return true;
			}catch(Exception e)
			{
				throw e;
			}
		}
		
		return false;
	}
	
	public HashMap<PostCode, Ville> getCitiesMap()
	{
		return cities;
	}
	
	public Collection<Ville> getCities()
	{
		return cities.values();
	}
	
	public Ville getCity(PostCode code)
	{
		return cities.get(code);
	}
	
	public void addCity(PostCode code, Ville city)
	{
		cities.put(code, city);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public int getMunicipalityPop(String codeMunicipality)
	{
		for(HashMap.Entry<PostCode, Ville> entry : cities.entrySet())
			if (entry.getKey().equals(codeMunicipality))
				return entry.getValue().getPop();
		
		return 0;
	}

	public int getDepartmentPop(String codeDepartment)
	{
		int total = 0;
		
		for(HashMap.Entry<PostCode, Ville> entry : cities.entrySet())
			if (entry.getKey().getCodeDepartment().toString().equals(codeDepartment))
				total += entry.getValue().getPop();
		
		return total;
	}

	public int getRegionPop(String codeRegion)
	{
		int total = 0;
		
		for(HashMap.Entry<PostCode, Ville> entry : cities.entrySet())
			if (entry.getKey().getCodeRegion().toString().equals(codeRegion))
				total += entry.getValue().getPop();
		
		return total;
	}
	
	public int getTotalPop()
	{
		int total = 0;
		
		for(HashMap.Entry<PostCode, Ville> entry : cities.entrySet())
			total += entry.getValue().getPop();
		
		return total;
	}
}
