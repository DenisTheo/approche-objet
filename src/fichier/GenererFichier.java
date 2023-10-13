package fichier;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenererFichier
{
    private static final String INPUT = "data/recensement.csv";
    private static final String OUTPUT = "data/newCSV25k.csv";
    
	public static void main(String[] args) throws IOException
	{
		ArrayList<Ville> cities = new ArrayList<>();

		// Split the document into lines
		Path path = Paths.get(INPUT);
		List<String> lines = Files.readAllLines(path);

		// Split the lines into elements
		String[] splitFirstLine = lines.get(0).split(";");
		String header = splitFirstLine[6] + ";" + splitFirstLine[2]
				+ ";" + splitFirstLine[1] + ";" + splitFirstLine[9];
		
		// Filling the list with data (skipping the header)
		for (int i=1; i<lines.size(); i++)
		{// Get the next line
			String[] splitLine = lines.get(i).split(";");
			
			// splitLine[9] = Total Population
			int pop = Integer.parseInt(splitLine[9].trim().replaceAll(" ", ""));
			
			// lineSplit[6] = City Name, [2] = Code Departement, [1] = Region
			cities.add(new Ville(splitLine[6], splitLine[2], splitLine[1], pop));
		}
		
		// Removing Cities with 25k residents or less
		Iterator<Ville> iterator = cities.iterator();
		while (iterator.hasNext())
		{
			Ville city = iterator.next();
			if (city.getPop()<= 25000)
				iterator.remove();
		}
		
		// Output creation
		File outputFile = new File(OUTPUT);
		outputFile.createNewFile();
		Path outputPath = Paths.get(OUTPUT);
		
		List<String> outputLines = new ArrayList<>();
		outputLines.add(header);
		
		for (Ville city: cities)
			outputLines.add(csvFactor(city));
		
		Files.write(outputPath, outputLines);
		System.out.println("written in " + OUTPUT);
	}
	
	public static String csvFactor(Ville city)
	{
		return city.getNom() + ";" + city.getCode() + ";"
	         + city.getNomRegion() + ";" + city.getPop();
	}
}
