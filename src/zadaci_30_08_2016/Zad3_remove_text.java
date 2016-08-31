package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*(Remove text) Write a program that removes all the occurrences of a specified string from a text file. For example, invoking
java Exercise12_11 John filename
  removes the string John from the specified file. Your program should get the arguments from the command line. */

public class Zad3_remove_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				File file = new File("test.txt");
			
				ArrayList<String> list = new ArrayList<>();
				
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the word you want to remove");
				
				String word = input.nextLine();
				
				try {
					list = readFileRemoveWord(file, word);
				} catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}

				try {
					saveFile(file, list);
				} catch (IOException ex) {
					ex.printStackTrace();
				}

	}

	// metoda cita fajl i brise rijecimethod reads the file, removes the word and all that returns to the list

		public static ArrayList<String> readFileRemoveWord(File file, String word)
				throws FileNotFoundException {
			ArrayList<String> listOfWords = new ArrayList<>();
			
			Scanner read = new Scanner(file);
			//vrti do kraja fajla
			while (read.hasNextLine()) {
				listOfWords.add(read.nextLine().replaceAll(word, "") + "\n");
			}
			return listOfWords;
		}

		// pise listu u fajl
		public static void saveFile(File file, ArrayList<String> list)
				throws IOException {
		
			FileWriter fw = new FileWriter(file);

			try {
			
				for (int i = 0; i < list.size(); i++) {
					fw.write(list.get(i));
				}
			} finally {
				fw.close();
			}

	}
	
}
