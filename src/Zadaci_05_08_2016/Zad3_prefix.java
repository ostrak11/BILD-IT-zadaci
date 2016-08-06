package Zadaci_05_08_2016;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveći zajednički prefix za ta dva stringa, 
 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeća dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" 
 * program treba da ispiše: Najveći zajednički prefix za dva stringa je "Dobrodošli u". */

public class Zad3_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);

		// unos dva stringa
		System.out.println("Unesite string s1:");
		String s1 = unos.nextLine();

		System.out.println("Unesite string s2:");
		String s2 = unos.nextLine();

		String temp;

		// zamjena pozicija u slucaju da je prvi string veci od drugog
		if (s1.length() > s2.length()) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}

		// pronalazak najveceg prefixa, u slucaju da su dva slova razlicita da
		// prekida petlju, u suprotnom da poveceva index na kojem se nalazi
		// zadanje identicno slovo
		int index = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				break;
			} else {

				index++;
			}

		}
		
		//ispis rezultata, kad je inde =0 i kad je veci od 0
		if (index == 0) {
			System.out.print("Nema zajednickog prefixa!!!");
		} else {
			System.out.println("Najveci zajednicki prefix za dva stringa'" + s1
					+ "' i '" + s2 + "' je: '" + s1.substring(0, index) + "'.");
		}
	}

}
