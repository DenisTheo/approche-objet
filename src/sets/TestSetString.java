package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString
{
	public static void main(String[] args)
	{
		HashSet<String> h7 = new HashSet<>();

		h7.add("USA");
		h7.add("France");
		h7.add("Allemagne");
		h7.add("UK");
		h7.add("Italie");
		h7.add("Japon");
		h7.add("Chine");
		h7.add("Russie");
		h7.add("Inde");
		
		String target = "";
		for(String country : h7)
			if (country.length() > target.length())
				target = country;
		
		h7.remove(target);
		
		for(String country : h7)
			System.out.println(country);
	}
}
