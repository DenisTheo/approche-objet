package fr.diginamic.chaines;

public class TestStringBuilder
{
	public static void main(String[] args)
	{
		System.out.println("Concat:");
		String strTest = "";
		long start = System.currentTimeMillis();
		for(int i=1; i<=100_000; i++)
			strTest = strTest + "" + i;
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end-start) + "ms.");
		
		System.out.println("- - - - - - - -");
		
		System.out.println("Append:");
		StringBuilder builderTest = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i=1; i<=100_000; i++)
			builderTest.append(i);
		end = System.currentTimeMillis();
		System.out.println("Time: " + (end-start) + "ms.");
	}
}
