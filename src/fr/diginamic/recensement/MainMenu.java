package fr.diginamic.recensement;

public class MainMenu extends MenuService
{	
	public MainMenu(Recensement recensement)
	{
		super(recensement);
	}

	public void traiter(Recensement recensement)
	{
		int option;
		do
		{
			System.out.print("\n                -Main Menu-\n"
					         + "1. See the Population Count of a given City\n"
                             + "2. See the Population Count of a given Department\n"
                             + "3. See the Population Count of a given Region\n"
                             + "4. See the 10 Regions with the most people\n"
                             + "5. See the 10 Departments with the most people\n"
                             + "6. See the 10 Cities with the most people in a given Department\n"
                             + "7. See the 10 Cities with the most people in a given Region\n"
                             + "8. See the 10 Cities with the most people\n"
                             + "9. Quit\n"
                             + "     > ");
	        try
	        {
	         	option = scanner.nextInt();
	        }catch(Exception e)
	        {
	        	option = 0;
	        	System.out.println("Please enter a valid option.");
	        	pause(1000);
	        	clear();
	        }
		}while(option < 1 && option > 9);
        
        menuSelect(option);
	}
	
	private void menuSelect(int option)
	{
		MenuService next;
		boolean bringMenuBack = true;
		clear();
        switch(option)
        {
        	case 1:
        		next = new MenuPopCity(getRecensement());
    			break;
    		case 2:
    			break;
    		case 3:
    			break;
    		case 4:
    			break;
    		case 5:
    			break;
    		case 6:
    			break;
    		case 7:
    			break;
    		case 8:
    			break;
    		default: //including case 9
    			bringMenuBack = false;
    			break;
    	}
        if(bringMenuBack)
        	next = new MainMenu(getRecensement());
        	
	}
}
