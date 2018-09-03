package cg.day7.que5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyDateTest {

		@Test
		void test() {
			MyDate md1 = new MyDate(LocalDate.of(2016, 01, 21));
			MyDate md2 = new MyDate(LocalDate.of(2017, 02, 22));
			MyDate md3 = new MyDate(LocalDate.of(2018, 03, 23));
			MyDate md4 = new MyDate(LocalDate.of(2019, 04, 24));
			MyDate md5 = new MyDate(LocalDate.of(2020, 05, 25));

			ArrayList<MyDate> inputList = new ArrayList<>();
			inputList.add(md1);
			inputList.add(md2);
			inputList.add(md3);
			inputList.add(md4);
			inputList.add(md5);

			try (FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\KAKALIDI\\notes\\test.txt");
					ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
				objectOutput.writeObject(inputList);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			ArrayList<MyDate> outputList = new ArrayList<>();

			try (FileInputStream fileInput = new FileInputStream("C:\\Users\\KAKALIDI\\notes\\test.txt");
					ObjectInputStream inputStream = new ObjectInputStream(fileInput)) {
					outputList = (ArrayList<MyDate>) inputStream.readObject();
					System.out.println(outputList);
					
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			assertEquals(true, inputList.toString().equals(outputList.toString()));
		}
		}
	