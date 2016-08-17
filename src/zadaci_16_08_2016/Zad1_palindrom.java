package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se čita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.*/

public class Zad1_palindrom {

	static Scanner unos= new Scanner(System.in);
	
	public static int provjera() {
		
		int broj = 0;	
		boolean provjera = true;	
		do {
			//ucitavanje unosa i provjera da li je int
			try {
				broj = unos.nextInt();	
				//uslov je da broj mora biti trocifreni
				if((broj>99)&&(broj<1000)){
					provjera = false;									
				}else{
					System.out.println("Pogresan unos. Pokusajte ponovo trocifrenim cijelim brojem: ");
				}
			}
			//hvata greska i trazi ponovni unos
			catch (InputMismatchException ex) {	
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				unos.nextLine();
			}
		} while (provjera);
		
		return broj;
	}
	
	public static boolean isPalindrom(int broj){
		//poredi prvu i zadnju cifru ako su iste vraca true
		if(broj/100 != broj%10){
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos i ispis rezultata
		System.out.println("Unesite cijeli trocifreni broj: ");
		int broj= provjera();
		
		System.out.println("Uneseni broj je palindrom??  "+ isPalindrom(broj));
		
		unos.close();
	}

}
