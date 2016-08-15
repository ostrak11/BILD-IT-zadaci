package zadaci_27_07_2016;

/* Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun koji ima godišnju interesnu stopu od 5%.
Mjesečna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na računu postaje 
100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na računu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
Nakon trećeg mjeseca, vrijednost na računu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
Napisati program koji pita korisnika da unese mjesečni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje računa.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1_stednja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isGood = true;
		while (isGood) {
			isGood = false;
			try {
				System.out.println("Enter the number :");
				int number = input.nextInt();
				// begin from the first prime number
				int i = 2;
				// while is number different from 1 and has no rest print i
				while (number != 1) {
					if (number % i == 0) {
						System.out.print(i + " ");
						// again devide with 2 if it can
						number = number / i;
					} else {
						// raise i by one and go through the loop
						i++;
					}
				}
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Invalid input: Enter an integer ");
				isGood = true;
			}
			// final statements
			finally {
				input.nextLine();
			}
		}
		// Scanner closed
		input.close();

	}
}