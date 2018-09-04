package cg.day7.que13;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

public class Assignments {
	private File assignmentFile;
	private LocalDate dueDate;

	private static LinkedList<Assignments> linked = new LinkedList<>();

	public Assignments() {
		super();
	}

	public Assignments(File assignmentName, LocalDate dueDate) {
		super();
		
		this.assignmentFile = assignmentName;
		this.dueDate = dueDate;
	}

	public static boolean add(Assignments assign) {
		try {
			assign.assignmentFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (linked.add(assign)) {
			return true;
		}
		return false;
	}

	public static boolean remove(Assignments assign) {
		assign.assignmentFile.delete();
		if (linked.remove(assign)) {
			return true;
		}
		return false;
	}

	public static void show() {
		for (Assignments assignments : linked) {
			System.out.println(assignments);
		}
	}

	public static Assignments search() {
		int result = 0;
		Assignments early = linked.getFirst();
		for (Assignments assignments : linked) {
			if (early.equals(assignments)) {
				continue;
			}
			result = assignments.dueDate.compareTo(early.dueDate);
			if (result < 0) {
				early = assignments;
			}
		}
		System.out.println(early);
		return early;
	}

	@Override
	public String toString() {
		return "Assignments [assignmentName=" + assignmentFile + ", dueDate=" + dueDate + "]";
	}
}
