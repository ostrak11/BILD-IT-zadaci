package zadaci_06_08_2016;
import java.util.Scanner;

/*Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo izračunati minimalnu dužinu piste potrebne
 *  da avion uzleti koristeći se sljedećom formulom: dužina = v * v / 2a. Napisati program koji pita korisnika da 
 *  unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)*/

public class Zad5_duzina_piste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		//unos brzine i ubrzanja
		System.out.println("Molimo Vas unesite brzinu'v' u m/s: ");
		double brzina=0;
		try {
			brzina = unos.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}
		
		System.out.println("Molimo Vas unesite ubrzanje koje avion ostvaruje 'a' u m/s^2: ");
		double ubrzanje=0;
		try {
			ubrzanje = unos.nextDouble();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresan unos!!!");
			System.exit(0);
		}
		
		//izracunavanje duzine i ispis rezultata
		double duzina= (brzina *brzina)/(2*ubrzanje);
		System.out.println("Duzina piste potrebne za uzlijetanje aviona iznosi " + duzina+" metara.");
		
		//zavtaranje resursa
		unos.close();
	}

}
