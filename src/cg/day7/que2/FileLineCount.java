package cg.day7.que2;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;


public class FileLineCount {
	public static int countLines(File file) {
	int count=0;
	try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader);) {
		
		String s;
		while ((s = reader.readLine()) != null) {
			count++;
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Total number of lines in the file are: "+count);
	return count;
}
}
