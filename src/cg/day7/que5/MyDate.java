package cg.day7.que5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MyDate implements Serializable{
	private LocalDate date;
	private String result;
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	public MyDate() {
		super();
	
	}
	
	public MyDate(LocalDate date) {
		super();
		this.date = date;
	}

	public static Object readWriteFile(ArrayList<MyDate> al) throws ClassNotFoundException {
		try (FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\KAKALIDI\\notes\\test.txt");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
			objectOutput.writeObject(al);

		} catch (IOException e) {
			e.printStackTrace();
		}

		ArrayList<MyDate> result = new ArrayList<>();
		try (FileInputStream fileInput = new FileInputStream("C:\\Users\\KAKALIDI\\notes\\test.txt");
				ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
			result = (ArrayList<MyDate>) objectInput.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return result.toString();
}

	@Override
	public String toString() {
		return  result;
	}
}
