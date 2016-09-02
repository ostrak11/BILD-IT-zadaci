package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* The popularity ranking of baby names from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored in files named 
 * babynameranking2001.txt, babynameranking2002.txt, . . . , babynameranking2010.txt. Each file contains one thousand lines. Each line contains 
 * a ranking, a boy’s name, number for the boy’s name, a girl’s name, and number for the girl’s name. 
 * For example, the first two lines in the file babynameranking2010.txt are as follows:
 * 
 * 1 Jacob 21,875 Isabella 22,731 
 * 2 Ethan 17,866 Sophia 20,477

So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s name Ethan and girl’s name Sophia are ranked #
2. 21,875 boys are named Jacob and 22,731 girls are named Isabella. Write a program that prompts the user to enter the year, 
gender, and followed by a name, and displays the ranking of the name for the year. Here is a sample run
 */

public class Zad3_Baby_name_popularity_ranking {

	public static void main(String[] args) throws FileNotFoundException {
		
		//unos parametara
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime godine: ");
		
		String year = input.next();
		//na osnovu unosa godine kreira se ime fajla
		String fileName = "babynameranking" + year + ".txt";
		
		File file = new File(fileName);
		System.out.println("Unesite spol M/F: ");


		//unos spola
		char ch = input.next().charAt(0);
		System.out.println("Unesite ime: ");
		
		String name = input.next();
		input.close();
		
		
		Scanner in = new Scanner(file);
		boolean found = false;
		
		//petlja vrti dok ne pronadje 
		while (in.hasNextLine()) {
		
			String[] line = in.nextLine().split("\\s+");
			//upoređujući u slučaju da je muškarac (element s indeksom 1 sadrži muško ime)
			if (Character.toUpperCase(ch) == 'M' && line[1].equals(name)) {
				// uslucaju da pronadje printa prametre
				System.out.println(name + " je rangirano #" + line[0]
						+ " in year " + year);
				
				found = true;
				// ako pronadje prekida petlju
				break;

				//Poredeći u slučaju da je ženski (element u indeks 3 sadrži zensko ime)
			} else if (Character.toUpperCase(ch) == 'F' && line[3].equals(name)) {
				// uslucaju da pronadje printa prametre
				System.out.println(name + " je rangirano #" + line[0]
						+ " u godini " + year);
				
				found = true;
				// ako pronadje prekida petlju
				break;
			}
		}
		in.close();
		//slucaj da imena nema
		if (!found) {
			System.out.println("Ime " + name + " nije pronadjeno u "
					+ year);
		}
	}
}
