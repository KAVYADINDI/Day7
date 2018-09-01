package cg.day7.que4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GrepApplication {

	public static boolean StringSearch(File file, String string) {
		int lineCount = 0;
		if (file.exists()) {
			try (FileReader fileReader = new FileReader(file);
					BufferedReader reader = new BufferedReader(fileReader);) {
				String s;
				while ((s = reader.readLine()) != null) {
					lineCount++;
					if (!s.equals("")) {
						String[] words = s.split(" ");
						for (int i = 0; i < words.length; i++) {
							if (words[i].equals(string)) {
							System.out.println(lineCount+ " " +s);
							break;
							}
						}	
					}
				}
				return true;
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The file does not exists");
		return false;
	}
}
