package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*Write a program that will count the number of characters, words, and lines in a file. Words are separated by whitespace characters. 
 * The file name should be passed as a command-line argumen*/

public class Zad4_Count_chara_words_lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// rovjeravamo da li postoji novi fajl
			File file = new File("test.txt");
			if (!file.exists()) {
				System.out.println(file + " nepostoji.");
				System.exit(2);
			}

			int characters = 0;
			int words = 0;
			int lines = 0;
			// brojimo karaktere, rijeci i redove
			try {
				Scanner input = new Scanner(file);
				while (input.hasNext()) {
					String s = input.nextLine();
					lines++;
					characters += s.length();
					String[] split = s.split(" ");
					for (String word : split) {
						words++;
					}
				}
			//hvatamo greske
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}

			System.out.println("Karaktera: " + characters);
			System.out.println("Rijeci: " + words);
			System.out.println("Redova: " + lines);

	}

}
