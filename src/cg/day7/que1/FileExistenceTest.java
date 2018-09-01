package cg.day7.que1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistenceTest {

	@Test
	void testExistanceOfFile() {
		File file = new File("C:\\Users\\KAKALIDI\\notes");
	assertEquals(true,file.exists());
	File file1 = new File("C:\\Users\\KAKALIDI\\notes\\day2");
	assertEquals(false,file1.exists());
	}
}
