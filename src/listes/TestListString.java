package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestListString
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Nice");
		list.add("Carcassone");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");
		
		Iterator<String> iterator = list.iterator();
		
		String target = "";
		
		while (iterator.hasNext())
		{
            String next = iterator.next();
            if (next.length() > target.length())
                target = next;
        }
		System.out.println(target);

		iterator = list.iterator(); // reset
		while (iterator.hasNext())
		{
            String next = iterator.next();
            list.set(list.indexOf(next), next.toUpperCase());
        }

		iterator = list.iterator(); // reset
		while (iterator.hasNext())
		{
            String next = iterator.next();
            if (next.startsWith("N"))
            	iterator.remove();
        }
		
		System.out.println(list.toString());
		
	}
}
