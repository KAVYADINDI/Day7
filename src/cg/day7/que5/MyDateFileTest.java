package cg.day7.que5;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class MyDateTest {

	@Test
	void testMyDate() throws ClassNotFoundException {

		MyDate date1 = new MyDate(LocalDate.of(2027, 12, 16));
		MyDate date2 = new MyDate(LocalDate.of(2012, 07, 13));
		MyDate date3 = new MyDate(LocalDate.of(2006, 03, 16));
		MyDate date4 = new MyDate(LocalDate.of(2017, 05, 14));
		MyDate date5 = new MyDate(LocalDate.of(2019, 9, 17));

		ArrayList<MyDate> al = new ArrayList<>();
		al.add(date1);
		al.add(date2);
		al.add(date3);
		al.add(date4);
		al.add(date5);

	assertEquals("[ 2027-12-16,  2012-07-13,  2006-03-16,  2017-05-14,  2019-09-17]",MyDate.readWriteFile(al));
		
	}

}
