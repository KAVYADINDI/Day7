package cg.day7.que6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class VowelsAndConsonentsCountTest {

	@Test
	void test() throws IOException {
		
		File file1 = new File("C:\\Users\\KAKALIDI\\notes\\test.txt");
		assertEquals("Vowels= 2 Consonants= 5", CharecterCount.vowelsAndConsonentcount(file1));
		File file = new File("C:\\Users\\KAKALIDI\\notes\\FileLineCheck.txt");
		assertEquals("Vowels= 134 Consonants= 199", CharecterCount.vowelsAndConsonentcount(file));
		File file2 = new File("C:\\Users\\KAKALIDI\\notes\\FileCheck.java");
		assertEquals("The file does not exist",CharecterCount.vowelsAndConsonentcount(file2));
	}

}
