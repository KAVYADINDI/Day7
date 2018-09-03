package cg.day7.que8;

import java.time.LocalDate;

public class TodaysDate {
	public static String displayTodaysDate() {
		LocalDate localDate = LocalDate.now();
		String todaysDate="";
		todaysDate=localDate.getDayOfWeek().name() + ", " + localDate.getMonth().name() + " "
				+ localDate.getDayOfMonth() + ", " + localDate.getYear();
		return todaysDate;
	}
}
