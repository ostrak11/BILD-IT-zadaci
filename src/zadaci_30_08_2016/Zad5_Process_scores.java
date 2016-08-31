package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

/*Suppose that a text file contains an unspecified number of scores separated by blanks. Write a program that prompts
 *  the user to enter the file, reads the scores from the file, and displays their total and average. */

public class Zad5_Process_scores {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
				Scanner input = new Scanner(System.in);
				// unos imena fajla
				System.out.println("Unesite ima fajla:");
				
				File file = new File(input.next());
			
				Scanner in = new Scanner(file);
				double sum = 0;
				double average = 0;
				double count = 0;
				// petlja vrti do kraja fajla sabira brojeve
				while (in.hasNext()) {
					
					sum += in.nextInt();
					//broji koliko ima ukupno brojeva
					count++;

				}
				input.close();
				in.close();
				
				//rezultati
				System.out.println("Suma je: " + sum);
				System.out.println("Prosjek je: " + sum/count);

	}

}
