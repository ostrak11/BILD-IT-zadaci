package zadaci_31_08_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/* Write a program that converts the Java source code from the next-line brace style to the end-of-line brace style. 
 * For example, the following Java source in (a) uses the next-line brace style. Your program converts it to the end-of-line brace style in (b).
 * 
 * 
 * Your program can be invoked from the command line with the Java sourcecode file as the argument. It converts the Java source code to a new format. 
 * For example, the following command converts the Java source-code file Test.java to the end-of-line brace style.

*/

public class Zad1_Reformat_Java_source_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String fileName = "test.txt";
		
			File file = new File(fileName);
		
			Scanner input = new Scanner(file);
			String string = "";
			
			while (input.hasNext()) {
				string += input.nextLine() + "\n";

			}
		
			string = string.replaceAll("\\)\\s*\\{", ") {");
			// uklanjanje praznog mjesta
			string = string.replaceAll("\\s*\\{", " {");
			input.close();
			// citanje obejkta
			PrintWriter pw = new PrintWriter(file);
			// dodavanje stringa u fajl
			pw.append(string);
			pw.close();
			System.out.println("Reformat complete.");
		} catch (Exception e) {
			System.out.println("File not found!");

		}
		
	}

}
