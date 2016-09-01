package zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/* Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number of scores. 
 * Write a program that reads the scores from the file and displays their total and average.Scores are separated by blanks. */

public class Zad4_Process_scores_in_a_text_file_on_the_Web {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
				URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
				//skenner koji cita sa linka
				Scanner in = new Scanner(url.openStream());
			
				double sum = 0;
				double count = 0;
				
				//petlja vrti do kraja file-a i dodaje vrijednosti na sumu
				while (in.hasNext()) {
				
					sum += in.nextDouble();
					count++;
				}
				in.close();
				
				// print rezultata
				double average = sum / count;
				System.out.println("Total of the scores was: " + sum);
				System.out.printf("Average was %.2f", average);
		
	}

}
