package Zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva različita pakovanja. Želimo napisati program koji upoređuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.*/


	public class Zad5_poredjenje_pakovanja {
	
		static Scanner unos = new Scanner(System.in);
		
		//metoda za provjeru tacnosti unosa(tip podataka)
		public static double provjera() {
				
				double broj = 0;	
				boolean provjera = true;	
				do {
					//ucitavanje unosa i provjera da li je int
					try {
						broj = unos.nextDouble();	
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

		//unos podataka
		System.out.println("Unesite tezinu(u gramima) prvog pakovanja: ");
		double gram1=provjera();
		
		System.out.println("Unesite cijenu prvog pakovanja: ");
		double km1=provjera();

		System.out.println("Unesite tezinu(u gramima) drugog pakovanja: ");
		double gram2=provjera();

		System.out.println("Unesite cijenu drugog pakovanja: ");
		double km2=provjera();
		
		
		//na kraju ih uporedimo i onaj sa manjom ukupnom cijenom je jeftiniji tj povoljniji
		if((km1/gram1)<(km2/gram2)){
			System.out.println("Prvo pakovanje je povoljnije!!!");
		}else{
			System.out.println("Drugo pakovanje je povoljnije!!!");
		}
		
		unos.close();
	}

}
