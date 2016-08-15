package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati metodu koja izračunava zbir svih brojeva u cijelom broju. Koristite sljedeći header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)*/

public class Zad4_zbir_cifara_broja {

	static Scanner unos= new Scanner(System.in);
	
	public static long provjera() {
		
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();	
				//uslov je da broj mora biti 0,1 ili 2
				
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
	
	
	public static int sumDigits(long n){
		
		int suma=0;
		//vrti sve dok broj nebude nula
		while(n!=0){
			//pronalazak posljednje cifre
			int cifra = (int) n%10;
			//broj skracujemo za jedno mjesto
			n=n/10;
			
			suma+=cifra;
		}
		return suma;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unos broja i ispis rezultata
		System.out.println("Unesite broj:");
		long broj=provjera();
		
		System.out.println("Suma cifara broja '"+broj + "' iznosi: " +sumDigits(broj)+".");
		
		unos.close();
	}

}
