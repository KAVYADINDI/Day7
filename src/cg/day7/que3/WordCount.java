package cg.day7.que3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static int countTotalWords(File file) {
		int count = 0;
		try (FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);) {
			String s;
			while (((s = reader.readLine()) != null)) {
				if (!s.equals("")) {
					String[] words = s.split(" ");
					if (words != null) {
						count += words.length;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("The total number of words in the file are: "+count);
		return count;
	}
}
