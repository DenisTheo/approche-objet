package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString
{
	public static void main(String[] args)
	{
		HashSet<Double> h7 = new HashSet<>();
		
		h7.add(1.5);
		h7.add(8.25);
		h7.add(-7.32);
		h7.add( 13.3);
		h7.add(-12.45);
		h7.add(48.5);
		h7.add(0.01);
		
		// display
		for(double x : h7)
			System.out.println(x);
		
		Iterator<Double> iterator = h7.iterator();
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		while (iterator.hasNext())
		{
            double next = iterator.next();
            if (next < min)
            	min = next;
            if (next > max)
            	max = next;
        }
		
		System.out.println("Biggest number is " + max);
 		h7.remove(min);
		
		// display again
		for(double x : h7)
			System.out.println(x);
	}
}
