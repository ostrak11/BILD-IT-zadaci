package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;


/*. Napisati program koji učitava neodređen broj cijelih brojeva, određuje koliko je pozitivnih brojeva korisnik unijeo, 
 *  koliko negativnih te izračunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu).
 *  Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, 
 *  negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.*/

public class Zad5_neg_poz_prosjek {
	
	static Scanner unos = new Scanner(System.in);
	
	public static int provjera() {
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();	
				//ako je sve ok, vrati broj	
				provjera = false;									
			}
			//hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {	
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite cijele brojeve, 0 prekida unos: ");
		
		int broj = provjera();		
		int ukupno = 0;				
		int plus = 0;				
		double suma = 0;					
		
		
		
		while(broj != 0) {	
				//sve dok je  broj razlicit od 0 povecavaj brojac brojeva
				ukupno++;
				//suma dodaje brojeve
				suma += broj;				
				//brojac pozitivnih brojeva
				if (broj > 0){			
					plus++;
				}
				//unos novog broja
				broj = provjera();		
				}
				unos.close();
		
			
				//ispis rezultata
				System.out.println("Broj unešenih pozitivnih brojeva je "+plus+".");
				System.out.println("Broj unešenih negativnih brojeva je "+(ukupno-plus)+".");
				System.out.println("Suma unešenih brojeva je "+suma+".");
				System.out.println("Prosjek unešenih brojeva je "+(suma/ukupno)+".");
		
					
	}

}