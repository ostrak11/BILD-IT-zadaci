package Zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napišite metodu sa sljedećim headerom koja vraća naopako ispisan broj koji joj je proslijeđen kao argument: public static void reverse(int number). 
 * Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.*/


public class Zad2_rikverc_broj {

	static Scanner unos = new Scanner(System.in);
	
	//prebacuje broj naopako
	public static void reverse(int n){
		
		int reverse = 0;
		
		//obrnut broj  	 
	    while( n != 0 ){
	    	reverse = reverse * 10;
	        reverse = reverse + n%10;
	        n = n/10;
	    }
	 
	    //ispis
	   System.out.println("Broj ispisan naopako: "+ reverse);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int broj = 0;	
		boolean provjera = true;	
		
		//unos broja, provjera unosa
		do {
			System.out.print("Unesite cijeli broj: ");
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
		
		//poziv metode 
		reverse(broj);
		
		unos.close();
	}

}
