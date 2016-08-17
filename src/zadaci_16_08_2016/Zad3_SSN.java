package zadaci_16_08_2016;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. 
 * Program treba da provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika da pokuša ponovo. 
 * Ukoliko jeste unešen u pravom formatu, program završava sa radom.*/

public class Zad3_SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos broja
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite SSN broj(DDD-DD-DDDD, D predstavlja broj): ");
		String SSN = unos.next();

		//uslovi koji trebaju biti ispunjeni da bi broj bio validan
		if (SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-'
				|| !Character.isDigit(SSN.charAt(0)) || !Character.isDigit(SSN.charAt(1))
				|| !Character.isDigit(SSN.charAt(2)) || !Character.isDigit(SSN.charAt(4))
				|| !Character.isDigit(SSN.charAt(5)) || !Character.isDigit(SSN.charAt(7))
				|| !Character.isDigit(SSN.charAt(8)) || !Character.isDigit(SSN.charAt(9))
				|| !Character.isDigit(SSN.charAt(10))) {
			System.err.println("Uneseni SSN broj nije validan!!!");
		} else {
			System.out.println("Uneseni broj je validan.");
		}

		unos.close();
	}

}
