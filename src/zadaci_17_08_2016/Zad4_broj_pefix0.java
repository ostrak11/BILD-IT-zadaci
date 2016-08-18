package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati metodu sa sljedećim headerom: public static String format(int number, int width) koja vraća string broja sa prefiksom od jedne ili više nula. 
 * Veličina stringa je width argument. Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraća 0034, ukoliko pozovemo format(34, 5) metoda vraća 00034. 
 * Ukoliko je uneseni broj veći nego width argument, metoda vraća samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraća 34.*/

public class Zad4_broj_pefix0 {
	
	static Scanner unos = new Scanner(System.in);

	public static int provjera() {

		int broj = 0;
		boolean provjera = true;
		do {
			// ucitavanje unosa i provjera da li je unos uredu
			try {
				//uzimamo samo prvi uneseni znak
				broj = unos.nextInt();
				
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
	public static String format(int number, int width){
		
		String s = String.format("%0" + width + "d", number);

		return s;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite broj: ");
		int broj =provjera();
		
		System.out.println("Unesite širinu broja: ");
		int sirina =provjera();
		
		System.out.println(format(broj,sirina));
		unos.close();
	}

}
