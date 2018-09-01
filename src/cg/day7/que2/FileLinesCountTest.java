package cg.day7.que2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import cg.day7.que3.WordCount;

class FileLinesCountTest {

	@Test
	void test() {
		File file = new File("C:\\Users\\KAKALIDI\\notes\\FileLineCheck.txt");
		assertEquals(5, FileLineCount.countLines(file));
		File file1 = new File("C:\\Users\\KAKALIDI\\notes\\FilewordsCheck.txt");
		assertEquals(11, FileLineCount.countLines(file1));
	}
}
