package Zadaci_08_08_2016;

import java.util.Scanner;

/* Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana. 
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. */

public class Zad2_broj_dana_u_mjesecu {
	
	//metoda za prestupnu godinu
	public static boolean isPrestupna(int god){
		if(((god%4==0) && (god/100 !=0))|| (god%400==0 )){
			return true;
		}else{
			return false;
		}
	}
	
	//metoda za broje mjeseci od 1 do 12
	public static boolean isUnosMjesec(int num){
		if((num<=0)||(num>12)){
			return false;
		}else{
			return true;
		}
		
	}
	
	//metoda za godinu vecu od 0 (mada nije potrebno)
	public static boolean isUnosGod(int num){
		if((num<0)){
			return false;
		}else{
			return true;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unos mjeseca i godine uz provjeru tacnosti unosa
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj mjeseca:");
		int mjesec=0;
		try {
			mjesec = unos.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresno ste unijeli mjesec!!!");
			System.exit(0);
		}
		
		while(isUnosMjesec(mjesec)==false){
			System.out.println("Molimo Vas unesite broj mjeseca od 1 do 12 !!!");
			try {
				mjesec= unos.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("Pogresno ste unijeli mjesec!!!");
				System.exit(0);
			}
		}
		
		
		System.out.println("Unesite godinu:");
		int god=0;
		try {
			god = unos.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Pogresno ste unijeli godinu!!!");
			System.exit(0);
		}
		
		while(isUnosGod(god)==false){
			System.out.println("Molimo Vas unesite godinu vecu od 0 !!!");
			try {
				god= unos.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("Pogresno ste unijeli mjesec!!!");
				System.exit(0);
			}
		}
		
		
		
		//ispitivanje slucajeva i ispis rezultata kad je godina prestupna
		switch(mjesec){
		
		case 1: 
			System.out.println("Mjesec Januar "+ god+" ima 31 dan.");
			break;
		
		
		case 2: 
			if(isPrestupna(god)==true){
				System.out.println("Mjesec Februar "+ god+" ima 29 dana.");
				break;
			}else{
				System.out.println("Mjesec Februar "+ god+" ima 28 dana.");
				break;
			}
			
		case 3: 
			System.out.println("Mjesec Mart "+ god+" ima 31 dan.");
			break;
			
		case 4: 
			System.out.println("Mjesec April "+ god+" ima 30 dana.");
			break;
			
		case 5: 
			System.out.println("Mjesec Maj "+ god+" ima 31 dan.");
			break;
			
		case 6: 
			System.out.println("Mjesec Juni "+ god+" ima 30 dana.");
			break;
			
		case 7: 
			System.out.println("Mjesec Juli " + god+" ima 31 dan.");
			break;
			
		case 8: 
			System.out.println("Mjesec Avgust "+ god+" ima 31 dan.");
			break;
			
		case 9: 
			System.out.println("Mjesec Septembar "+ god+" ima 30 dana.");
			break;
			
		case 10: 
			System.out.println("Mjesec Oktobar "+ god+" ima 31 dan.");
			break;
			
		case 11: 
			System.out.println("Mjesec Novembar"+ god+" ima 30 dana.");
			break;
			
		case 12: 
			System.out.println("Mjesec Decembar"+ god+" ima 31 dan.");
			break;
			
	}
	
		unos.close();
	}

}
