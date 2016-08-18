package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji prima ASCII kod (cijeli broj između 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.*/

public class Zad1_ASCII {
	
	static Scanner unos = new Scanner(System.in);

	public static int provjera() {

		int broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				broj = unos.nextInt();
				if(broj>0 && broj<127){
					provjera = false;
				}else{
					System.out.println("Unesite cijeli broj između 0 i 127!!!");
				}

			}
			// hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos broja i ispis karaktera
		System.out.println("Unesite broj: ");
		int broj=provjera();
		System.out.println("ASCII karakter: '"+ (char)(broj)+"'." );
		
		
		unos.close();
		
	}

}
