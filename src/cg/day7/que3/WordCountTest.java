package cg.day7.que3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;


class WordCountTest {

	@Test
	void test() {
		File file = new File("C:\\Users\\KAKALIDI\\notes\\FileLineCheck.txt");
        assertEquals(5, WordCount.countTotalWords(file));
        File file1 = new File("C:\\Users\\KAKALIDI\\notes\\FilewordsCheck.txt");
        assertEquals(21, WordCount.countTotalWords(file1));
	}

}
