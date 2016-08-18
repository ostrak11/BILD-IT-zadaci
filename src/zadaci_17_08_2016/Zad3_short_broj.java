package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj.
 *  Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101*/

public class Zad3_short_broj {
	
	static Scanner unos = new Scanner(System.in);

	public static short provjera() {

		short broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				//uzimamo samo prvi uneseni znak
				broj = unos.nextShort();
				
				provjera=false;

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
		System.out.println("Unesite broj: ");
		short broj =provjera();
		
		//formatiranje stringa  binarni sistem uz zamjenu praznih mjesta sa 0
		String s = String.format("%16s", Integer.toBinaryString(broj)).replace(' ', '0');
		if (broj < 0){
			 s = s.substring(s.length() - 16);
		}
		//ispis
		System.out.printf("Binarna reprezentacija broja %d u 16 bita je %s.", broj, s);
		
		unos.close();
	}

}
