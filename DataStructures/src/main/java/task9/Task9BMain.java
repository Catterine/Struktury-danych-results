package task9;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Task9BMain {
	public static void main(String[] args) {
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(new Date()));

		Locale locale = new Locale("PL", "pl");

		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT, locale).format(new Date()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG, locale).format(new Date()));
	}
}
