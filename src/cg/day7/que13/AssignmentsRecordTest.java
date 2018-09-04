package cg.day7.que13;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class AssignmentsRecordTest {

	@Test
	void test() {
		Assignments assign1 = new Assignments(new File("C:\\Users\\KAKALIDI\\notes\\D1.txt"), LocalDate.of(2014, 9, 25));
		Assignments assign2 = new Assignments(new File("C:\\Users\\KAKALIDI\\notes\\D2.txt"), LocalDate.of(2014, 9, 24));
		Assignments assign3 = new Assignments(new File("C:\\Users\\KAKALIDI\\notes\\D3.txt"), LocalDate.of(2014, 9, 18));
		assertEquals(true, Assignments.add(assign1));
		assertEquals(true, Assignments.add(assign2));
		assertEquals(true, Assignments.remove(assign1));
		Assignments.show();
		System.out.println("\n");
		assertEquals(true, Assignments.add(assign3));		
		Assignments.show();
		System.out.println("\n");
		assertEquals(assign3, Assignments.search());
	}

}
