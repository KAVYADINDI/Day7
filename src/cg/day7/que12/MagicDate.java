package cg.day7.que12;

import java.time.LocalDate;

public class MagicDate {

	public static String checkIfMagicDate(LocalDate date) {
		int month=(Integer)date.getMonthValue() ;
		int year=date.getYear() ;
		int day=date.getDayOfMonth() ;
		if((day*month)==year)
			return "Magic date" ;
		return "Not a Magic date"; 	
	}
}
