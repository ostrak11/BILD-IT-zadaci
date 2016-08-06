package Zadaci_05_08_2016;

import java.util.Scanner;
/* Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun koji ima godišnju interesnu stopu od 5%.
 *  Mjesečna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na računu postaje 100 * (1 + 0.00417) = 100.417. 
 *  Nakon drugog mjeseca, vrijednost na računu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 *  Nakon trećeg mjeseca, vrijednost na računu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 *  Napisati program koji pita korisnika da unese mjesečni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje računa.
*/


public class Zad1_stednja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		
		
		Double stednja;
		try {
			//unos mjesecnog anuiteta i broja mjeseci
			System.out.println("Unesite mjesecni iznos stednje:");
			stednja = unos.nextDouble();
			System.out.println("Unesite broj mjeseci nakon kojeg bi ste zeljeli znati stanje racuna:");
			int mjesec =unos.nextInt();
			
			double suma=0;
			//formula za izracunavanje stanja racuna na odredjeni period
			for (int i =1; i<=mjesec;i++){
				suma=(suma+stednja)*(1+0.00417);
			}
			//ispis
			System.out.println(suma);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("pogresan unos!!!");
			System.exit(0)
			;
		}
		
		
	}

}
