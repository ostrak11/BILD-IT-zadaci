package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji učitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. 
 * Pretpostavimo da nula prekida unos brojeva. Ukoliko unesemo sljedeći niz brojeva 2 5 6 23 42 58 2 6 0 
 * program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd. */

public class Zad5_ponavljanje_brojeva {

	static Scanner unos=  new Scanner(System.in);
	
	//metoda ispituje tacnost unosa podataka
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

		int[] niz = new int[100];
		
			//unosimo elemente u niz sve kod je unos razlicit od nule
			System.out.println("Unesite elemente niza, nula prekida unos:");
			for (int i=0; i<100; i++){
				int broj=provjera();
				
				//unos predstavljaju index od 1 do 100, svaki put kad se unese broj poveca se broj na njegovom indexu u okviru niza
				if((broj!=0)&&(broj<=100)&&(broj>0)){
					niz[broj]++;
				}else{
					break;
				}
			}
		
			//ispis rezultata gdje index predstavlja broj, a njegovo vrijednost iz niza broj ponavljanja
			for (int i=1; i<niz.length;i++){
				if(niz[i]!=0){
					System.out.println("Broj " + i+ " se ponavlja " + niz[i] + " puta.");
				}
			}
		
	unos.close();
	}
}
