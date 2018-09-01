package cg.day7.que4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class GrepJavaTest {

	@Test
	void test() {
		File file = new File("C:\\Users\\KAKALIDI\\notes\\FileLineCheck.txt");
		assertEquals(true, GrepApplication.StringSearch(file,"Java"));
		File file1 = new File("C:\\Users\\KAKALIDI\\notes\\FilewordsCheck.txt");
		assertEquals(true,GrepApplication.StringSearch(file1,"the"));
		File file2 = new File("C:\\Users\\KAKALIDI\\notes\\FileCheck.java");
		assertEquals(false,GrepApplication.StringSearch(file2,"the"));
	}
}
