package cg.day7.que12;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class MagicDateTest {

	@Test
	void testWithValidInputs() {
MagicDate date= new MagicDate();
		assertEquals("Magic date",date.checkIfMagicDate(LocalDate.of(60,4,15)));
	}
	void testWithInvalidInputs() {
		MagicDate date= new MagicDate();
		assertEquals("Not a Magic date",date.checkIfMagicDate(LocalDate.of(75,4,15)));
	}
}
