package zadaci_01_09_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/* A university posts its employees’ salaries at http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a 
 * faculty member’s first name, last name, rank, and salary (see Programming Exercise 12.24). Write a program to display the total salary 
 * for assistant professors, associate professors, full professors, and all faculty, respectively, and display the average salary for
 *  assistant professors, associate professors, full professors, and all faculty, respectively. */

public class Zad1_Process_large_dataset {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// url object with web adress
				URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
				
				Scanner unos = new Scanner(url.openStream());
				
				double sumAssistant = 0;
				double countAssistant = 0;
				double sumAssociate = 0;
				double countAssociate = 0;
				double sumFull = 0;
				double countFull = 0;
				double total = 0;
				double countTotal = 0;
			
				while (unos.hasNextLine()) {
				
					String[] line = unos.nextLine().split(" ");
					// dodavanje plate trecem indexu u nizu
					total += Double.parseDouble(line[3]);
					// brojanje clanoca
					countTotal++;
					// provjera zvanja i povecavanje brojaca i dodavanje vrijednosti na sumu
					if (line[2].equals("assistant")) {
						sumAssistant += Double.parseDouble(line[3]);
						countAssistant++;
					} else if (line[2].equals("associate")) {
						sumAssociate += Double.parseDouble(line[3]);
						countAssociate++;
					} else if (line[2].equals("full")) {
						sumFull += Double.parseDouble(line[3]);
						countFull++;
					}
				}
				unos.close();
				
				//print rezultata
				System.out
						.printf("Ukupna plata za asistenta: %.2f \nprosjecna plata za asistenta je %.2f",
								sumAssistant, (sumAssistant / countAssistant));
				System.out
						.printf("\nUkupna plata za pomocnika: %.2f \nprosjecna plata za pomocnika je %.2f",
								sumAssociate, (sumAssociate / countAssociate));
				System.out
						.printf("\nUkupna plata za redovnog profesora: %.2f \nprosjecna plata za redovnog profesora je %.2f",
								sumFull, (sumFull / countFull));
				// printing out result for total salaries and average
				System.out.printf(
						"\nUkupna plata za osoblje fakulteta je: %.2f a prosjecna plata je: %.2f",
		total, (total / countTotal));
		
	}

}
