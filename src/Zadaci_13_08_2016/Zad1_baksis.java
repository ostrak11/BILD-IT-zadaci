package Zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Izračunavanje napojnice) Napisati program koji učitava ukupan iznos računa koji treba uplatiti kao i procenat tog računa 
 * kojeg želimo platiti kao napojnicu te izračunava ukupan račun i napojnicu. Na primjer, ukoliko korisnik unese 10 kao račun 
 * i 15 % kao procenat za napojnicu program treba da ispiše da je ukupan račun za uplatiti 11.5 a napojnica 1.5. */

public class Zad1_baksis {
	
	static Scanner unos = new Scanner(System.in);
	
	//metoda za provjeru tacnosti unosa(tip podataka)
		public static double provjera() {
			
			double broj = 0;	
			boolean provjera = true;	
			do {
				//ucitavanje unosa i provjera da li je int
				try {
					broj = unos.nextDouble();	
					//ako je sve ok, vrati broj	
					provjera = false;									
				}
				//hvata greska i trazi ponovni unos
				catch (InputMismatchException ex) {	
					System.out.println("Pogresan unos. Pokusajte ponovo: ");
					unos.nextLine();
				}
			} while (provjera);
			
			return broj;
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos racuna ui napojnice
		System.out.println("Unesite iznos racuna: ");
		double racun=provjera();
		
		System.out.println("Unesite postotak koji zelite dati kao napojnicu(postotak): ");
		double baksis=provjera();
		
		//ispis ukupnog racuna(racun+napojnica)
		System.out.println("Ukupno trebate platiti: " + racun*(1+baksis/100));
		
		unos.close();
	}

}
