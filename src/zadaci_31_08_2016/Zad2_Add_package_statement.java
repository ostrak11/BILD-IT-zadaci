package zadaci_31_08_2016;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/* Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. 
 * Write a program to insert the statementpackage chapteri; 
 * as the first line for each Java source file under the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34 are 
 * under the root directory srcRootDirectory. 
 * The root directory and chapteri directory may contain other folders and files. Use the following command to run the program:
 java Exercise12_18 srcRootDirectory */

public class Zad2_Add_package_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 0) {
			// workspace name passed through cmd
			String workspaceName = "source";
			// lista paketa u workspace-u
			File[] workspacePackages = new File(workspaceName).listFiles();
			// loop that goes through the packages
			for (int i = 0; i < workspacePackages.length; i++) {
				// lista fajlova u paketu
				File[] files = workspacePackages[i].listFiles();
				// loop through all the files in the packages
				for (int j = 0; j < files.length; j++) {
					// dodavanje paketa fileu
					addName(files[j], workspacePackages[i].getName());
				}
			}
			
			System.out.println("Package names have been added.");
		}
		
	}

	public static void addName(File file, String packageName) {
		
		if (file.isFile()) {
			// initialize scanner object null
			Scanner input = null;

			try {
				
				input = new Scanner(file);
				// string sapublic static void addName(File file, String packageName) {
				// if parametar is a file
				if (file.isFile()) {
					// initialize scanner object null
					Scanner input1 = null;

					try {
						// assigning new value to the scanner(scanner with file)
						input1 = new Scanner(file);
						// string that contains package name
						String textWithPackage = "package " + packageName + ";\n\n";
						// loop that uses scanner to read the text from the file
						while (input1.hasNext()) {
							// storing lines from the file into the string
							textWithPackage += input1.nextLine() + "\n";
						}
						// writing the text with added package name back into the file
						PrintWriter pw = new PrintWriter(new FileOutputStream(file));
						pw.append(textWithPackage);
						pw.close();

					} catch (Exception ex) {
						System.out.println("File not found");
					}
				} else {
					// if its directory
					// list of files in the directory
					File[] files = file.listFiles();
					// loop that goes through the array of files
					for (int i = 0; i < files.length; i++) {
						// adding the name to all the files in the array
						addName(files[i], file.getName());
					}
		}
				String textWithPackage = "package " + packageName + ";\n\n";
				// loop that uses scanner to read the text from the file
				while (input.hasNext()) {
					// storing lines from the file into the string
					textWithPackage += input.nextLine() + "\n";
				}
				// writing the text with added package name back into the file
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));
				pw.append(textWithPackage);
				pw.close();

			} catch (Exception ex) {
				System.out.println("File not found");
			}
		} else {
			// if its directory
			// list of files in the directory
			File[] files = file.listFiles();
			// loop that goes through the array of files
			for (int i = 0; i < files.length; i++) {
				// adding the name to all the files in the array
				addName(files[i], file.getName());
			}
		}
	}
}
