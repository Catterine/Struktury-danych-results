package task9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task9AMain {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = dateFormat.format(new Date());

		System.out.println(date1);

		try {
			Date date = dateFormat.parse("2018-06-13 23:14:06");

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.HOUR, 1);
			calendar.add(Calendar.MINUTE, 1);
			calendar.add(Calendar.SECOND, 1);

			System.out.println(dateFormat.format(calendar.getTime()));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
