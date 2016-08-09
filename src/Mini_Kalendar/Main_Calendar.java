package Mini_Kalendar;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class Main_Calendar {

	//metoda za tacnost unosa broja mjeseci
	public static boolean isMon(int num){
		if((num<=0)||(num>12)){
			return false;
		}else{
			return true;
		}
		
	}
	
	//metoda za godinu vecu od 0 (mada nije potrebno)
	public static boolean isGod(int num){
		if((num<0)){
			return false;
		}else{
			return true;
		}
		
	}
	
	//metoda za provjeru unosa za opcije
	public static boolean provjeraUnosa(int unos){
		if ((unos==1)||(unos==2)||(unos==3)){
			return true;
		}
		return false;
	}
	
	//
	private static int unosDana(int godina, int mjesec) {
		
		Kalendar kalendar = new Kalendar(); 
		
		System.out.print("Unnesite dan: ");
		int dan = unosBroja(); 
		
		// Ne mozemo unijeti veci broj za dane nego li u posmatranom mjesecu ima dana, pa ako smo unijeli biramo ponovo
		while (dan > kalendar.daniUmjesecu(godina, mjesec) && dan == 0) {
			System.out.println("Ggreska, ovaj mjesec imaA " + kalendar.daniUmjesecu(godina, mjesec) + " DANA");
			System.out.print("Pokusaj ponovo: ");
			dan = unosBroja();
		}
		// Vracamo dane
		return dan;
	}
	
	//metoda za unos pozitivnog broja
	private static int unosBroja() {
		
		Scanner unos = new Scanner(System.in);
		
		int broj = 1;
	
		while(true) {
			try{
				broj = unos.nextInt();
				//  uslov da unos mora biti pozitivan
				if (broj < 0) {
					System.out.print("Vas unos ne moze biti nula ili negativan. Unesite pozitivan broj: ");
				} else {
					// Ukoliko su svi uslovi ispunjeni metoda vraca uneseni broj
					return broj;
				}
			} catch(InputMismatchException ex) {
				// Ukoliko nije unesena odgovarajuca vrijednost, pokazati gresku
				System.out.print("Greska! Pogresan unos. Pokusaj ponovo: ");
				// Potrebno kako bi se vratili na pocetak petlje
				unos.nextInt();
			}finally{
				unos.close();
				
			}
			//reda radi
			return broj;
		}
		
	
	}
	
	
		
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Kalendar kal = new Kalendar();
		
		Scanner unos = new Scanner(System.in);
		
		//unos godine i mjeseca uz provjeru tacnosti unosa 
		System.out.println("Unesite mjesec: ");
		int mon=0;
		
	
		try {
			mon = unos.nextInt();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Pogresan unos!!!");
			System.exit(0);
		}
		
		
		while(isMon(mon)==false){
			System.out.println("Pogresno sta unijeli mjesec pokusajte sa cijelim brojem od 1 do 12");
			mon=unos.nextInt();
		}
		
		System.out.println("Unesite godinu: ");
		
		int god=0;
		try {
			god = unos.nextInt();
		} catch (Exception e1) {
			System.out.println("Pogresan unos!!!");
			System.exit(0);
		}
		
		while(isGod(god)==false){
			System.out.println("Pogresno sta unijeli godinu pokusajte sa cijelim vecim od nule");
			god=unos.nextInt();
		}
		
		//ispis kalendara za dati mjesec i godinu
		kal.printKalendar(god, mon);
		
		//meni sa opcijama uz provjeru unosa
		System.out.println();
		while(true){
			
			System.out.println("Izaberite jednu od ponudjenih opcija: ");	
			System.out.println("[1] Unos u podsjetnik");
			System.out.println("[2] Kalendar");
			System.out.println("[3] Exit");
			System.out.println("UNESITE VASU OPCIJU: ");
			
			int izbor=0;
			try {
				izbor = unos.nextInt();
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.err.println("Pogresan unos, pokusajte ponovo!!!");
				izbor = unos.nextInt();
				
			}
			
			while(provjeraUnosa(izbor)==false){
				System.out.println("Pogresan unos. Pokusajte sa opcijama 1,2 ili 3");
				izbor=unos.nextInt();
			}
			
			
			switch(izbor){
			
			case 1:
				//poziv metoda za unosa dana za koji cuvamo podatke
				int dan = unosDana(god, mon);
				System.out.println("Unesite podsjetnik za " + dan + "." + mon + "." + god + ".: ");
				String podsjetnik = unos.nextLine(); // Unos podsjetnika
				// Pozivamo metodu za upis podataka u fajl, koja se nalazi u klasi Kalendar
				kal.upisPodsjetnik(god, mon, dan, podsjetnik);
				break;
				
				
			
			case 2:
				//unos godine i mjeseca za promjenu kalendara
				System.out.println("Unesite mjesec: ");
				int mjeseca=unos.nextInt();
				
				while(isMon(mon)==false){
					System.out.println("Pogresno sta unijeli mjesec pokusajte sa cijelim brojem od 1 do 12");
					mjeseca=unos.nextInt();
				}
				
				
				System.out.println("Unesite godinu: ");
				int godina=unos.nextInt();
				
				while(isGod(god)==false){
					System.out.println("Pogresno sta unijeli godinu pokusajte sa cijelim vecim od nule");
					godina=unos.nextInt();
				}
				
				//print kalendara
				kal.printKalendar(godina, mjeseca);
				
				//print svi podsjetnika datim mjesecu
				System.out.println("Podsjetnici u ovom mjesecu:");
				
				for (int i =0; i<kal.daniUmjesecu(godina, mjeseca);i++){
					File fajl= new File ((i + "." +mjeseca + "." + godina + ".txt"));
					if (fajl.exists()){
						kal.ispisPodsjetnik(godina, mjeseca, i);
						System.out.println();
					}
				}
				
				break;
				
			case 3:
				//izlaz iz programa
				System.out.println("Program ugašen!!!");
				System.exit(0);
			
			}
		}
		
	}

}
