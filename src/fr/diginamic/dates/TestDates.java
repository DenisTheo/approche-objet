package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates
{
	public static void main(String[] args)
	{
		Date date1 = new Date(System.currentTimeMillis());
		
		System.out.println(date1);
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		System.out.println(format2.format(date1));
		System.out.println(format2.format(date2));
	}
}
