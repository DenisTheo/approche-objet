package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(cal.getTime()));

		format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format.format(Calendar.getInstance().getTime()));

		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");
		System.out.println(format.format(Calendar.getInstance().getTime()));

		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		System.out.println(format.format(Calendar.getInstance().getTime()));

		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		System.out.println(format.format(Calendar.getInstance().getTime()));

		format = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		System.out.println(format.format(Calendar.getInstance().getTime()));
	}
}
