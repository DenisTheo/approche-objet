package utils;

public class TTestMethodeStatic
{
	public static void main(String[] args)
	{
		String chaine = "12";
		
		int entier = Integer.parseInt(chaine);
		
		int a = 5;
		int b = entier;
		
		System.out.println(Integer.max(a, b));
	}
}
