package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)*/

public class Zad5_piramida {

	static Scanner unos = new Scanner(System.in);

	public static int provjera() {

		int broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();
				provjera = false;

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

		 System.out.println("Unesite velicinu piramide: ");
		 int broj=provjera();
		

		//prolazi kroz redove na redove
		for (int j = 1; j <= broj; j++) {
			//prolazi kroz kolone i ide od broj do (-broja),a posto nam ne treba 0 i ponovna jedinica umanjujemo brojac za 2
			for (int i = -broj; i <= broj - 2; i++) {

				//sve negativne vrijedosti pretvarano u pozitivne
				if (i < 0) {
					//ako je i<=j ispisuje ga ako nije ostavlja prazan prostor
					if (Math.abs(i) <= j) {
						System.out.print(Math.abs(i));
					} else {
						System.out.print(" ");
					}
				//za brojeve vece od 0, posto trebamo da izbacimo 0 i 1, prvi naradni broj treba da bude 2, onda dodajemo +2
				} else {
					if (i + 2 <= j) {
						System.out.print(i + 2);
					} else {
						System.out.print("");
					}

				}

			}
			System.out.println();
		}

		
		unos.close();
	}

}
