package cg.day7.que10;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Dates {
	private static int day;
	private static int month;
	private static int year;

	public static Boolean checkDate(String dt) {
		String[] dateProperties = dt.split("/");

		if (dateProperties != null) {
			year = Integer.parseInt(dateProperties[0]);
			month = dateProperties.length > 1 ? Integer.parseInt(dateProperties[1]) : 1;
			day = dateProperties.length > 2 ? Integer.parseInt(dateProperties[2]) : 1;
			try {
				LocalDate.of(day, month, year);
				return true;
			} catch (DateTimeException e) {
				return false;
			}

		}
		return null;
	}

	public static LocalDate futureDate(int i) {
		LocalDate futureDate = LocalDate.of(day,month,year).plusDays(6);
		System.out.println(futureDate);
		return futureDate;
	}

}
