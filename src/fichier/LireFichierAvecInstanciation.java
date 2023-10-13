package fichier;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LireFichierAvecInstanciation
{
    private static final String INPUT = "data/recensement.csv";
    
	public static void main(String[] args) throws IOException
	{
		ArrayList<Ville> cities = new ArrayList<>();

		// Split the document into lines
		Path path = Paths.get(INPUT);
		List<String> lines = Files.readAllLines(path);

		// Filling the list with data (skipping the header)
		for (int i=1; i<lines.size(); i++)
		{// Get the next line
			String[] splitLine = lines.get(i).split(";");
			
			// splitLine[9] = Total Population
			int pop = Integer.parseInt(splitLine[9].trim().replaceAll(" ", ""));
			
			// splitLine[6] = City Name, [2] = Code Departement, [1] = Region
			cities.add(new Ville(splitLine[6], splitLine[2], splitLine[1], pop));
		}
		for (Ville city: cities)
			System.out.println(city.toString());
	}
}
