package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisati program koji prima karakter te vraća njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraća 69 kao unicode za taj karakter.*/

public class Zad2_unicode {
	
	static Scanner unos = new Scanner(System.in);

	public static char provjera() {

		char karakter = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				//uzimamo samo prvi uneseni znak
				karakter = unos.next().charAt(0);
				
				provjera = false;
				

			}
			// hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return karakter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//unos broja i ispis karaktera
			System.out.println("Unesite karakter: ");
			char znak =provjera();
			System.out.println("ASCII broj: '"+ (int)(znak)+"'." );
		
			unos.close();
	}

}
