package Zadaci_05_08_2016;

import java.util.Scanner;

/*Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeći header: 
 * public static int countLetters(String s). Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.*/

public class Zad5_brojacslova {
	
	public static int countLetters(String s){
		
		int brojac=0;
		//povecava brojac ako je u stringu karakter slovo
		for (int i=0; i<s.length();i++){
			if(Character.isLetter(s.charAt(i))){
				brojac++;
			}
		}
		//vraca brojac
		return brojac;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		//unos stringa
		System.out.print("Unesite neki string:");
		String s= unos.nextLine();
		
		unos.close();
		
		//pozivanje metode i ispis dobivenog rezultata
		System.out.println("Vas string '"+s+"' sadrzi "+countLetters(s)+" slova.");
	}

}
