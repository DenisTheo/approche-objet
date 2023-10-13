package fr.diginamic.recensement;

public class Application
{
    private static final String INPUT = "data/recensement.csv";
    
	public static void main(String[] args)
	{
		Recensement recensement = new Recensement();
		MainMenu app;

		// Data Input + tells if it succeeds or not with a boolean
		if(recensement.getDataSet(INPUT))
			app = new MainMenu(recensement); // it will manage sub menus on its own
	}
}
