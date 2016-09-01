package zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/* Write a program that counts the number of words in President Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/ Lincoln.txt. */

public class Zad3_Count_words {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		// scenner cita sa linka
		Scanner in = new Scanner(url.openStream());
		int sumWords = 0;
		//vrti do kraja fajla
		while (in.hasNextLine()) {
			
			String line = in.nextLine();
			// dodavanje broja rijeci iz svake linije na sumu
			sumWords += line.split(" ").length;
		}
		in.close();
		System.out.println("File has: " + sumWords + " words.");
		
	}

}
