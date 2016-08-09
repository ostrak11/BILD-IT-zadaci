package Zadaci_08_08_2016;

import java.util.Scanner;
import java.util.InputMismatchException;

/* Napisati program koji ispisuje tri nasumična cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese tačan odgovor, program mu čestita i završava sa radom. */


public class Zad1_sabrianje3broja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		//generisanje brojeva
		int num1= (int)(Math.random()*10);
		int num2= (int)(Math.random()*10);
		int num3= (int)(Math.random()*10);
		
		System.out.println("Koliki je zbir brojeva "+ num1+ ", " + num2+ " i "+ num3+ "?");
		
		double rez=0;
		try {
			rez = unos.nextDouble();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.err.println("Nepravilno ste unijeli rezultat!!!");
			System.exit(0);
		}
		
		//provjera rezultata, ukoliko nije tacan ponovno pitanje i unos odg
		while(rez!=num1+num2+num3){
			System.err.println("Vas pokusaj je pogresan pokusajte ponovo!!!");
			System.out.println("Koliki je zbir brojeva "+ num1+ ", " + num2+ " i "+ num3+ "?");
			rez=unos.nextDouble();
		}
		//ispis poruke ukoliko je rezultat tacan
		System.out.println("Vas rezultat je tacan!!!");
		
		unos.close();
	}

}
