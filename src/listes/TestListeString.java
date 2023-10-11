package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		System.out.println(list.size());
		
		int target = list.get(0);
		for(int i=1; i<list.size(); i++)
			if (list.get(i) > target)
				target = list.get(i);
		System.out.println("The greatest number in the list is " + target + ".");

		target = list.get(0);
		for(int i=1; i<list.size(); i++)
			if (list.get(i) < target)
				target = list.get(i);
		System.out.println("The smallest number in the list was " + target + ", it is now deleted.");
		list.remove(list.indexOf(-2));
		
		for(int i=0; i<list.size(); i++)
		{
			if (list.get(i) < 0)
				list.set(i, Math.abs(list.get(i)));
			System.out.println(list.get(i));
		}
	}
}
