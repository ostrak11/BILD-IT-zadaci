package zadaci_31_08_2016;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


/* Create a data file with 1,000 lines. Each line in the file consists of a faculty member’s first name, last name, rank, and salary. 
 * The faculty member’s first name and last name for the ith line are FirstNamei and LastNamei. The rank is randomly generated as assistant, 
 * associate, and full. The salary is randomly generated as a number with two digits after the decimal point. The salary for an assistant 
 * professor should be in the range from 50,000 to 80,000, for associate professor from 60,000 to 110,000, and for full professor from 
 * 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data: 
 * 		FirstName1 LastName1 assistant 60055.95 
 * 		FirstName2 LastName2 associate 81112.45 
 * 		. . . 
 * 		FirstName1000 LastName1000 full 92255.21 */

public class Zad5_Create_large_dataset {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			// kreiranje objekta
				File file = new File("Salary.txt");
				
				String[] rank = { "assistant", "associate", "full" };
				String[] toFile = new String[1000];
				
				Arrays.fill(toFile, "");
				
				//
				for (int i = 0; i < 1000; i++) {
					// dodaje prvo ime 
					toFile[i] += "FirstName" + (i + 1) + " ";
					// dodaje drugo ime
					toFile[i] += "LastName" + (i + 1) + " ";
					
					String rankStr = rank[((int) (Math.random() * 3))];
					toFile[i] += rankStr + " ";
					
					if (rankStr == "assistant") {
						Random r = new Random();
						double sal = 50000 + (80000 - 50000) * r.nextDouble();
						toFile[i] += String.format("%.2f", sal) + "\n";
						
					} else if (rankStr == "associate") {
						Random r = new Random();
						double sal = 60000 + (110000 - 60000) * r.nextDouble();
						toFile[i] += String.format("%.2f", sal) + "\n";
						
					} else if (rankStr == "full") {
						Random r = new Random();
						double sal = 75000 + (130000 - 75000) * r.nextDouble();
						toFile[i] += String.format("%.2f", sal) + "\n";
					}
				}
				
				FileWriter fw = new FileWriter(file);
				try {
					//print elemenata iz array-a u file
					for (int i = 0; i < 1000; i++) {
						fw.write(toFile[i]);

					}
					//hvatanje gresaka
				} catch (IOException ex) {
					System.out.println("Index not fund.");
				} finally {
					fw.close();
				}

	}

}
