package zadaci_16_08_2016;

import java.util.Scanner;

/*Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. */

public class Zad2_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String s= unos.nextLine();
		
		//ispis rezultata pozivom funkcija, ako se misli na ukupanzu duzinu stringa
		System.out.println("Duzina stringa je: " + s.length());
		System.out.println("Prvo slovo stringa je: "+ s.charAt(0));
		
		//ako se misli na broj karaktera u stringu
		s=s.replace(" ", "");
		System.out.println("Broj karaktera u stringu je: " + s.length());
		
		unos.close();
	}

}
