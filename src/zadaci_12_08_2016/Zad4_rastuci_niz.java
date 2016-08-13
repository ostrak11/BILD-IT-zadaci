package zadaci_12_08_2016;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad4_rastuci_niz {
	
	/*Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastućem redosljedu. 
	 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraća brojeve u rastućem redosljedu.*/

	static Scanner unos=  new Scanner(System.in);
	
	
	public static void rastuciNiz(int broj1, int broj2, int broj3){
		
		
				int[] niz = {broj1,broj2,broj3};
				int temp = 0;
				
				// prolazimo kroz niz dva puta i poredimo brojeve
				for(int i = 0; i<niz.length; i++){
					for(int j=i; j<niz.length; j++){
						
						// promjena mjesta ukoliko je broj vecih od susjednih
						if(niz[i]>niz[j]){
							temp = niz[i];
							niz[i] = niz[j];
							niz[j] = temp;
						}
					}
				}
				
				// ispis sortiranog niza
				for(int e:niz){
					System.out.print(e+ " ");
				}

	}
	
	//metoda za provjeru tacnosti unosa(tip podataka)
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
		int[] niz= new int[3];
		//unos brojeva i provjera
		System.out.print("Unesite prvi broj: ");
		niz[0] = provjera();
		System.out.print("Unesite drugi broj: ");
		niz[1] = provjera();
		System.out.print("Unesite treci broj: ");
		niz[2] = provjera();
		
		//sortiranje i print niza pozivanjem funkcije
		Arrays.sort(niz);
		for(int e:niz){
			System.out.print(e+" ");
		}
		
		//pozivanje metode i print niza
		System.out.println();
		rastuciNiz(niz[0],niz[1],niz[2]);	
		
	
	}
	

}
