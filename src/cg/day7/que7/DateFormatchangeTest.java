package cg.day7.que7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateFormatChangeTest {

	@Test
	void test() {
		assertEquals("1/12/2012; 1 December,2012",MyDate.formatChange("01122012"));
		assertEquals("16/10/2011; 16 October,2011",MyDate.formatChange("16102011"));
		assertEquals("31/12/2000; 31 December,2000",MyDate.formatChange("31122000"));
		assertEquals("The entered dt is invalid",MyDate.formatChange("35122000"));
		assertEquals("The moth entered is invalid",MyDate.formatChange("31162000"));
	}

}
