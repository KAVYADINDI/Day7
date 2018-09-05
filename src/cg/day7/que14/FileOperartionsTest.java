package cg.day7.que14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileOperartionsTest {

	@Test
	void test() {
		assertEquals(true, FileOperations.operations("C:\\Users\\KAKALIDI\\notes\\D4.txt","null",1));
		assertEquals(true, FileOperations.operations("C:\\Users\\KAKALIDI\\notes\\D4.txt","C:\\Users\\KAKALIDI\\notes\\D2.txt", 2));
		assertEquals(false, FileOperations.operations("C:\\Users\\KAKALIDI\\notes\\D4.txt","C:\\Users\\KAKALIDI\\notes\\D2.txt", 2));
		assertEquals(true, FileOperations.operations("C:\\Users\\KAKALIDI\\notes\\D4.txt","null",3));

	}

}
