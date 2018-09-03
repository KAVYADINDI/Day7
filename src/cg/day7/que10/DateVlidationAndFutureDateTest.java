package cg.day7.que10;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DateVlidationAndFutureDateTest {
	@Test
	void testWithValidInputs() {
	Boolean validated=Dates.checkDate("12/3/2018");
	if(validated)
	{
		assertEquals(LocalDate.of(2018, 03, 18),Dates.futureDate(5));
	}
	else
	{
		System.out.println("Test case faied");
	}
}
	@Test
	void testWithInvalidInputs()
	{
		Boolean validated=Dates.checkDate("30/2/2018");
		if(validated)
		{
			assertEquals(LocalDate.of(2018, 03, 18),Dates.futureDate(5));
		}
		else
		{
			System.out.println("Test case faied");
		}
	}
}
//assertEquals(LocalDate.of(2018, 13, 18),Dates.futureDate(5));
//assertEquals(LocalDate.of(2018, 11, 31),Dates.futureDate(5));



