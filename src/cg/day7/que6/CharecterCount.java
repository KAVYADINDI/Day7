package cg.day7.que6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CharecterCount {

	public static int vowels;
	public static int consonants;

	public static Object vowelsAndConsonentcount(File file) throws IOException {
		vowels=0;
		consonants=0;
		if (file.exists()) {
			Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
			try (FileReader fileReader = new FileReader(file);
					BufferedReader reader = new BufferedReader(fileReader);) {
				String s;
				while ((s = reader.readLine()) != null) {
					if (!s.equals("")) {
						String[] words = s.split(" ");
						for (int i = 0; i < words.length; i++) {
							for (int j = 0; j < words[i].length(); j++) {
								if (set.contains(Character.toUpperCase(words[i].charAt(j))))
									vowels++;
								else if (Character.isLetter(words[i].charAt(j)))
									consonants++;
							}
						}
					}
				}

				System.out
						.println("The file " + file + " has " + vowels + " vowels and " + consonants + " consonants.");
				return "Vowels= " + vowels + " Consonants= " + consonants;
			}

		}
		System.out.println("The file does not exist");
		return "The file does not exist" ;
	}
}
