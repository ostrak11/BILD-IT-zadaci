package zadaci_10_08_2016;

import java.util.Scanner;

/* Napisati metodu koja vraća broj dana u godini. Metoda koristi sljedeći header: public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese početnu godinu, krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.*/

public class Zad1_dana_u_godini {
	
	//metoda za ispitivanje da li je godina prestupna
	public static boolean isPrestupna(int god){
		if(((god%4==0) && (god/100 !=0))|| (god%400==0 )){
			return true;
		}else{
			return false;
		}
	}
	
	//metoda koja vraca broj dana u zavisnosti od godine da li je prestupna ili ne	
	public static int numberOfDayInAYear(int year){
		if(isPrestupna(year)){
			return 366;
		}else{
			return 365;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		boolean nesto=true;
		boolean nas=true;
		int temp;
		int pocetna=0;
		int kraj=0;
		
		while(nesto){
			System.out.println("Unesite pocetnu godinu: ");
			try {
				pocetna=unos.nextInt();
				nesto=false;
			} catch (Exception e) {
			// TODO Auto-generated catch block
				System.err.println("Greska pri unosu, pokusajte ponovo sa cijelim brojem!!!");
				unos.nextLine();
			}
		}
		

		while(nas){
			System.out.println("Unesite krajnju godinu: ");
			try {
				kraj=unos.nextInt();
				nas=false;
			} catch (Exception e) {
			// TODO Auto-generated catch block
				System.err.println("Greska pri unosu, pokusajte ponovo sa cijelim brojem!!!");
				unos.nextLine();
			}
		}
		
		
		if(pocetna<kraj){
			
			System.out.println("Ispis godina sa brojem dana: ");
			for (int i=pocetna;i<=kraj;i++){
				System.out.println("Godina "+ i+ " ima "+numberOfDayInAYear(i)+ " dana.");
			}
		}else{
			System.out.println("Pogresan unos, unesite prvo manju godinu!!!");
		}
		
		
	}

}

