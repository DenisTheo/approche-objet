package fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreerFichier
{
    private static final String INPUT = "data/recensement.csv";
    private static final String OUTPUT = "data/100first.csv";
    
    public static void main(String[] args)
    {
        int linesToRead = 100;

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT));
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT)))
        {

            // Read the first 100 lines from the input file
            for(int i=0; i<linesToRead; i++)
            {
                String line = reader.readLine();

                // If the line is null, we reached the end of the file
                if (line == null)
                    break;

                // Write the line to the output file
                writer.write(line);
                writer.newLine();
            }

            System.out.println("First 100 lines copied to " + OUTPUT);

        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
